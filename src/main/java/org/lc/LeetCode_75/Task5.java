package org.lc.LeetCode_75;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverseVowels(new String("hello")));
    }

    public static String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        ArrayList<Character> allVowelsArr = new ArrayList<Character>();
        for (int index = 0; index < vowels.length(); index++) {
            allVowelsArr.add(vowels.charAt(index));
        }
        ArrayList<Character> charsVowels=new ArrayList<>();
        ArrayList<Integer> indexesOfVowels=new ArrayList<>();
        for (int index = 0; index < s.length(); index++) {
            if (allVowelsArr.contains(s.charAt(index))) {
                indexesOfVowels.add(index);
                charsVowels.add(s.charAt(index));
            }
        }
        for (int index = 0; index < charsVowels.size(); index++) {
            result.setCharAt(indexesOfVowels.get(index), charsVowels.get(charsVowels.size()-index-1));
        }

        return result.toString();
    }
}
