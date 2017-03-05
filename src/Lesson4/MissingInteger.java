package Lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class MissingInteger {
    public int solution(int[] A) {
        int res = 1;
        Set<Integer> set = new HashSet<>();

        // remove duplicates
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        while (set.contains(res)) res++;
        return res;
    }
}
