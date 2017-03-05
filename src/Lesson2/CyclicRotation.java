package Lesson2;

import java.util.Arrays;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int len = A.length;
        int step = K % len;
        if (len == 0 || step == 0) return A;

        int[] B = new int[len];
        Arrays.fill(B, 0);

        int y = 0;
        for (int i = 0; i < len; i++) {
            int newIndex = i + (step);
            if (newIndex > len - 1) {
                newIndex = y++;
            }
            B[newIndex] = A[i];
        }
        return B;
    }
}
