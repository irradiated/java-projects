//find a square number which is exactly a concatenation of two numbers

import java.util.*;
import java.io.*;

public class ConcatenatedSquare {

    public static void main(String[] args) {

        for (int i=0; i < 100000; i++) {

            int square = i * i;
            String numToString = Integer.toString(square);
            int middle = numToString.length() / 2;
            String[] halves = {numToString.substring(0, middle),numToString.substring(middle)};

            String cat = halves[0] + halves[1];

            if (halves[0].equals(halves[1])) {
                System.out.println(cat);
                System.out.println(i);
                break;
            }
            
        }

    }



}