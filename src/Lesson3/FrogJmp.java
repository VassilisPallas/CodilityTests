package Lesson3;

/**
 * Created by Vassilis Pallas on 5/3/2017.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return X <= Y ? (int) Math.ceil((Y - X) / (double) D) : 0;
    }
}
