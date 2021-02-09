//********************************************************************
//  Decode.java
//
//  Demonstrates the use of the QueueList class.
//********************************************************************

import java.util.*;

public class Decode
{

   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);

      QueueList myQ = new QueueList();

      String message;
      int index = 0;

      System.out.println ("Enter the message:");
      message = scan.nextLine();
      System.out.println ("The message is:");

      while (index < message.length())
      {
         // Enqueue word onto queue
         while (index < message.length() && message.charAt(index) != ' ')
         {
            myQ.enqueue(new Character(message.charAt(index)));
            index++;
         }

         // Print word in original order
         while (!myQ.empty())
            System.out.print (((Character)myQ.dequeue()).charValue());
         System.out.print (" ");
         index++;
      }

      System.out.println();
   }
}
