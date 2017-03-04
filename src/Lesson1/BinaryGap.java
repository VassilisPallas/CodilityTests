package Lesson1;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class BinaryGap {
    public int solution(int N) {
        int gap = 0;
        int max = 0;

        // shift trailing zeros
        while ((N & 1) == 0) {
            N = N >> 1;
        }

        while (N != 0) {
            // if N AND 1 equals to zero, increase gap, otherwise make it zero
            if ((N & 1) == 0) {
                if (++gap > max) max = gap;
            } else {
                gap = 0;
            }

            // left shift N
            N = N >> 1;
        }

        return max;
    }
}
