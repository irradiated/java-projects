import java.util.*;

public class Dice {
    Random numgen = new Random();
    private int result;
    private String resultString;

    public Dice() {
        result = 0;
    }

    public int[] rollArray(int howMany, int dieType) {
        int[] array = new int[howMany];
        for (int i = 0; i < array.length; i++) {
            array[i] = numgen.nextInt(dieType) + 1;
        } return array;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int L : array) {
            output.append(L.toString());
            output.append("\n");
        }
        return output.toString();
    }

    public static void main(String[] args) {

    }
}