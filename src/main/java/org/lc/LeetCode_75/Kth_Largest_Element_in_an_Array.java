package org.lc.LeetCode_75;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {// HEAP

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            pQueue.add(nums[i]);
        }
        while(k-->1){
            pQueue.poll();
        }
        return pQueue.poll();

    }
}
