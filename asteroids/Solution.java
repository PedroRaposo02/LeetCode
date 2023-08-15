package asteroids;

import java.util.Arrays;


public class Solution {
    public int[] asteroidCollision2(int[] asteroids) {
        int length = 0;
        int right = 1;

        while (right < asteroids.length) {
            int curr = asteroids[length];
            int next = asteroids[right];

            boolean isLast = right == asteroids.length - 1;

            if ((curr > 0 && next > 0) || (curr < 0 && next < 0)) {
                if (isLast) {
                    length++;
                }
                length++;
            } else if ((curr > 0 && next < 0)) {
                if (Math.abs(curr) < Math.abs(next)) {
                    asteroids[length] = next;
                    if (length > 0) {
                        length--;
                        right--;
                    }
                } else if (Math.abs(curr) > Math.abs(next)) {
                    length++;
                }
            } else {
                if (isLast) {
                    length++;
                }
                length++;
            }
            right++;
        }

        int[] result = Arrays.copyOf(asteroids, length);

        return result;
    }
    
    public int[] asteroidCollision(int[] asteroids) {
        int length = 0;

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            if (length == 0 || curr > 0) {
                asteroids[length++] = curr;
            } else {
                while (length > 0 && asteroids[length - 1] > 0) {
                    int prev = asteroids[length - 1];
                    if (prev == -curr) {
                        length--;
                        break;
                    } else if (prev < -curr) {
                        length--;
                    } else {
                        break;
                    }
                }
                if (length == 0 || asteroids[length - 1] < 0) {
                    asteroids[length++] = curr;
                }
            }
        }

        int[] result = Arrays.copyOf(asteroids, length);
        return result;
    }
}
