import Lesson1.BinaryGap;
import Lesson2.CyclicRotation;
import Lesson2.OddOccurrencesInArray;
import Lesson3.FrogJmp;
import Lesson3.PermMissingElem;
import Lesson3.TapeEquilibrium;
import Lesson4.MissingInteger;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Binary Gap
//        System.out.println(new BinaryGap().solution(1041));
//
//        // OddOccurrencesInArray
//        int[] OddOccurrencesInArray = {9, 3, 9, 3, 9, 7, 9};
//        System.out.println(new OddOccurrencesInArray().solution(OddOccurrencesInArray));
//
//        // CyclicRotate
//        int[] CyclicRotation = {3, 8, 9, 7, 6};
//        System.out.println(Arrays.toString(new CyclicRotation().solution(CyclicRotation, 3)));
//
//        // FrogJmp
//        System.out.println(new FrogJmp().solution(10, 85, 30));
//
//        // PermMissingElem
//        int[] PermMissingElem = {2, 3, 1, 5};
//        System.out.println(new PermMissingElem().solution(PermMissingElem));

//        // TapeEquilibrium
//        int[] TapeEquilibrium = {-10, -20, -30, -40, 100};
//        System.out.println(new TapeEquilibrium().solution(TapeEquilibrium));

        // MissingInteger
        int[] MissingInteger = {1, 3, 6, 4, 1, 2};
        System.out.println(new MissingInteger().solution(MissingInteger));
    }
}
