import java.util.*;

public class DnDice {
    Random numgen = new Random();
    private int roll;
    private String resultString;

    public DnDice(int dieType) {
        roll = numgen.nextInt(dieType) + 1;
    } public int[] rollArray(int howMany, int dieType) {
        int[] array = new int[howMany];
        for (int i = 0; i < array.length; i++) {
            array[i] = numgen.nextInt(dieType) + 1;
        } return array;
    } public String toString() {
        resultString = String.format("%d", roll);
        return resultString;
    } public static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            } System.out.print(anArray[i]);
        } System.out.print("\n");
    } public int getRoll() {
        return roll;
    }
}
