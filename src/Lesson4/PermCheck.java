package Lesson4;

import java.util.HashSet;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (A[i] > max) max = A[i];
        }

        if (set.size() != A.length) return 0;

        int permutation = 1;
        for (int i = 1; i <= max; i++) {
            if(!set.contains(i)){
                permutation = 0;
                break;
            }
        }
        return permutation;
    }
}
