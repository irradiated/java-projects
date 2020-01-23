import java.util.*;

public class DnDice {
    Random numgen = new Random();
    private int roll;
    private String resultString = "";
    ArrayList <Integer> list = new ArrayList<Integer>();

    public DnDice() {  }

    public ArrayList roll(int howMany, int dieType) {
      list.clear();
      for (int i = 0; i < howMany; i++) {
          roll = numgen.nextInt(dieType) + 1;
          list.add(roll);
      } return list;
    }

    public String toString() {
      for (int i = 0; i < list.size(); i++) {
        resultString += list.get(i) + " ";
      }
      return resultString;
    }
}
