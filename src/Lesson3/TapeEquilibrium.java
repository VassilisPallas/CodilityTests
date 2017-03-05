package Lesson3;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        if (A.length == 2)
            return Math.abs(A[0] - A[1]);

        int leftSum;
        int rightSum = 0;
        int diff;

        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }
        leftSum = A[0];
        diff = Math.abs(leftSum + rightSum);

        for (int i = 1; i < A.length; i++) {
            leftSum += A[i];
            rightSum -= A[i];

            if (Math.abs(leftSum - rightSum) < diff) {
                diff = Math.abs(leftSum - rightSum);
            }
        }
        return Math.abs(diff);
    }
}
