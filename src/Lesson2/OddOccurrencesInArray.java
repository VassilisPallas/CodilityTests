package Lesson2;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            result ^= A[i];
        }

        return result;
    }
}
