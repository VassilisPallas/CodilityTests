package Lesson2;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            // XOR flips certain bits. By applying XOR with the same numbers again with the same integer later on,
            // we flipping them back. The result is the number that never canceled itself out.
            result ^= A[i];
        }

        return result;
    }
}
