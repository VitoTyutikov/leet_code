package org.lc.LeetCode_75;

import java.util.ArrayList;

public class Task6 {
    public static String reverseWords(String s) {
        String result = new String();
        String[] strings = s.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals(" ") && !strings[i].equals("\n")&&!strings[i].equals("")) {
                    result += strings[i] + " ";
            }
        }
        if(result.charAt(result.length()-1)==' '){
            result=result.substring(0, result.length()-1);
        }
        return result;
    }
}
