package can_place_flowers;

public class Solution {
    /*
     * You have a long flowerbed in which some of the plots are planted, and some
     * are not. However, flowers cannot be planted in adjacent plots.
     * 
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
     * and 1 means not empty, and an integer n, return true if n new flowers can be
     * planted in the flowerbed without violating the no-adjacent-flowers rule and
     * false otherwise.
     */

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 1;
        int result = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            int num = flowerbed[i];
            if (num == 0) {
                count++;
            } 
            else {
                result += (count - 1) / 2;
                count = 0;
            }

            if (i == flowerbed.length - 1 && num == 0) {
                result += count / 2;
                count = 0;
            }
        }

        return result >= n;
    }
}
