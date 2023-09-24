package org.lc.LeetCode_75;
// 1
public class Task1 {   
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = len1>len2?len2:len1;
        for(int i=0;i<minLen;i++){
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        if(len1>len2){
            result += word1.substring(minLen);
        }else if(len1<len2){
            result += word2.substring(minLen);
        }
        return result;
    }

}


