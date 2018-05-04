// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/torque-and-development/problem

import java.util.*;

public class Solution {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        long queries = in.nextLong();
        long countCities = 0, countRoads = 0, city1 = 0, city2 = 0;
        long[] connections;

        while (queries-- > 0) {
            countCities = in.nextLong();
            countRoads = in.nextLong(); 

            long costLibrary = in.nextLong();
            long costRoad = in.nextLong();

            connections = new long[(int) countCities];
            Arrays.fill(connections, -1);

            while (countRoads-- > 0) {

                city1 = getRoot(connections, in.nextLong() - 1);
                city2 = getRoot(connections, in.nextLong() - 1);
                
                if (city1 != city2) {
                    connections[(int) city2] = connections[(int) city1] + connections[(int) city2];
                    connections[(int) city1] = city2;
                }
            }

            long result = 0;
            
            if (costRoad > costLibrary) {
                result = costLibrary * countCities;
            } else {
                result = Arrays.stream(connections)
                            .filter(value -> value < 0)
                            .map(value -> (Math.abs(value) - 1) * costRoad + costLibrary)
                            .sum();
            }

            System.out.println(result);
        }
    }

    public static long getRoot(long[] connections, long index) {
        if (connections[(int) index] < 0) {
            return index;
        }

        return getRoot(connections, connections[(int) index]);
    }
}
