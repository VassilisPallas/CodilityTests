import Lesson1.BinaryGap;
import Lesson2.OddOccurrencesInArray;

public class Main {

    public static void main(String[] args) {
        // Binary Gap
        System.out.println(new BinaryGap().solution(1041));

        // OddOccurrencesInArray
        int[] array = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(new OddOccurrencesInArray().solution(array));
    }
}
