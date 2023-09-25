package org.lc.LeetCode_75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        


    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> result=new ArrayList<Boolean>();
      
      int max = Arrays.stream(candies).max().getAsInt();

      for (int candy : candies) {
        if(candy+extraCandies>=max){
            result.add(true);
        } else{
            result.add(false);
        }
      }
      return result;
    }
    
}
