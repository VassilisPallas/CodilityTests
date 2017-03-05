package Lesson3;

import java.util.stream.IntStream;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        int sum = 0;
        int totalSum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        for (int i = 0; i <= A.length + 1; i++) {
            totalSum += i;
        }

        return totalSum - sum;
    }
}
