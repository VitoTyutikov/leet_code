package org.lc.LeetCode_75;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        scanner.close();
        System.out.println(gcdOfStrings(str1, str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        String result = "";

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 1; i <= str1.length(); i++)
            strings.add(str1.substring(0, i));
        for (int i = 1; i <= str2.length(); i++)
            strings.add(str2.substring(0, i));
        for (String s : strings) {
            if (s.repeat(str1.length() / s.length()).equals(str1) && s.repeat(str2.length() / s.length()).equals(str2)
                    && s.length() > result.length()) {
                result = s;
            }

        }

        return result;
    }
}
