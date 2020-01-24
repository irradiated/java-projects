import java.util.*;

public class Dice {
    Random numgen = new Random();
    private int result;
    private String resultString;

    public Dice() { }

    public Dice(int die) {
        result = numgen.nextInt(die) + 1;
    }

    public String toString() {
      resultString = Integer.toString(result);
      return resultString;
    }

    public int getResult() {
      return result;
    }

}
