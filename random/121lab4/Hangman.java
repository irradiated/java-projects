package Lab4;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
         public static void main(String[] args) throws Exception {
        	 File dictionary = new File("C:\\Users\\dell\\eclipse-workspace\\COSC 121\\src\\Lab4\\dictionary.txt");
        	 Scanner textScanner = new Scanner(dictionary);
        	 
        	 Scanner input = new Scanner(System.in);
        	 
        	 ArrayList<String> words = new ArrayList<>();
        	 while(textScanner.hasNext()) {
        		 words.add(textScanner.nextLine());  		 
        	 }
        	 String hiddenText = words.get((int)(Math.random() * words.size()));
        	
        	 char[] textArray = hiddenText.toCharArray();
        	 char[] answers = new char[textArray.length];
        	 for(int i = 0; i < textArray.length; i++)
        	 {
        		 answers[i] = '?';
        		 }
        	 boolean finished = false;
        	 int lives = 7;
        	  while(finished == false) {
        
        		  String letter = input.next();
        		  
        		  while(letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
        			  System.out.println("Error Input, Try Again");
        			  letter = input.next();
        		  }
        		  
        		  boolean found = false;
        		  for(int i = 0; i < textArray.length; i++) {
        			  if(letter.charAt(0) == textArray[i]) {
        				  answers[i] = textArray[i];
        				  found = true;
        			  }
        		  }
        		  if(!found) {
        			  lives--;
        			  System.out.println("Incorrect Guesses: " + answers);
        		  }
        		  boolean done = true;
        		  for(int i = 0; i< answers.length; i++) {
        			  if(answers[i] == '?') {
        				  System.out.print(" _");
        				  done = false;
        			  }
        			  else {
        				  System.out.print(" " + answers[i]);
        			  }
        		 }
        		  System.out.println("\n" + "Guesses Left: " + lives);
        		  if(done) {
        			  System.out.println("Congrats! You found the Word");
        			  finished = true;
        		  }
        		  if(lives <= 0) {
        			  System.out.println("You lose!");
        			  finished = true;
        		  }
        		  
        }
      }

   }
