package org.lc.LeetCode_75;

public class Task4 {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean can = false;
        int canToFlower = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    canToFlower++;
                }
            }
        }
        if (canToFlower >= n) {
            can = true;
        }
        return can;
    }
}