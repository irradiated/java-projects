// Pig Latin.java
// Edited by: Dakota Flath

import java.util.Scanner;

public class PigLatin
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);

      QueueList word = new QueueList();

      String message;
      int index = 0;
      char firstch;

      System.out.println ("Enter an English sentence: ");
      message = scan.nextLine();
      System.out.println ("The equivalent Pig Latin sentence is: ");

      // complete the code below to convert input message to Pig Latin sentence
      firstch = message.charAt(0);

      while (index < message.length())
      {
         // Enqueue word onto queue
         while (index < message.length() && message.charAt(index) != ' ')
         {
            
            word.enqueue(new Character(message.charAt(index)));
            index++;
            firstch = (Character)word.peek();
         }

         if (firstch != 'a' && firstch != 'e' && firstch != 'i' && firstch != 'o' && firstch != 'u' && firstch != ' ' && firstch != 'A' && firstch != 'E' && firstch != 'I' && firstch != 'O' && firstch != 'U') {
            word.dequeue();
            word.enqueue(new Character(firstch));
            word.enqueue(new Character('a'));
            word.enqueue(new Character('y'));
            word.enqueue(new Character(' '));
         }

         else {
            
            word.dequeue();
            word.enqueue(new Character(firstch));
            word.enqueue(new Character('y'));
            word.enqueue(new Character(' '));
         }

         // Print word in original order
         while (!word.empty())
            System.out.print (((Character)word.dequeue()).charValue());
         System.out.print (" ");
         index++;
      }
      System.out.println();
   }
}
