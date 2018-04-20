// Author: Romulo Jovelli

// Receives an URL in a old format, returns it in a new format
// Old format /pt-br/some/path/to/resource.html
// New format /some/path/to/resource/html?lang=pt-br
// 
// Formats in en-us are omitted in old format, but must be added in new format.

import java.util.*;

public class Solution {

    /* Implement this method. You can add other methods if you want */
    static String FormatNewURL(String url) {
        String[] urls = url.split("/");
        String result = "";
        
        if (urls.length != 0 && urls[1].contains("-")) {
            result = handleLang(urls);
        } else {
            result = url + "?lang=en-us";
        }
            
        return result;
    }

    private static String handleLang(String[] urls) {
        StringBuilder result = new StringBuilder();
        String lang = "?lang=" + urls[1];
    
        for (int i = 2; i < urls.length; i++) {
            result.append("/");
            result.append(urls[i]);
        }

        result.append(lang.toLowerCase());

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(FormatNewURL("/Pt-br/some/path/to/resource.html"));
    }
}
