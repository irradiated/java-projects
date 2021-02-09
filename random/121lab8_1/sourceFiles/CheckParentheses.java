//********************************************************************
//  CheckParentheses.java
//
//  Demonstrates other use of the StackList class from our Stack package
//  implemented with our List class.
//  Edited by Dakota Flath
//********************************************************************

import java.util.Scanner;

public class CheckParentheses
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);

      StackList myStack = new StackList();

      String expression, keep_going="y";
      int index;
      boolean properlyNested;

      while (keep_going.charAt(0) == 'y' || keep_going.charAt(0) == 'Y')
      {
      	 index = 0 ;
      	 properlyNested = true;
         System.out.print ("Enter an arithmetic expression with parentheses:");
         expression = scan.nextLine();
         while (index < expression.length() && properlyNested == true)
         {  //If the character in index position of expression is equal to '(',
            // push it on to myStack
            // else if it is equal to ')' then do the following:\
            //     - check if myStack is not empty, pop an element out from myStack
            //         otherwise set properlyNested to false
            if (expression.charAt(index) == '(') {
               myStack.push(expression.charAt(index));
            } else if (expression.charAt(index) == ')') {
               if (!myStack.empty()) {
                  myStack.pop();
               }
               else {
                  properlyNested = false;
               }
            }
      	  // increment index by 1, inorder to deal with next character of expression
            index++;
         }


         // At the end of the while loop, check to see if myStack is empty or not,
         //if not empty set properlyNested to false
         if (!myStack.empty()) {
            properlyNested = false;
         }

         // use a while to pop out all elements (if not empty) from myStack to prepare it
         // to work with next expression
         while (!myStack.empty()) {
            myStack.pop();
         }

         // print the output message to tell the ezpression is properly nested with
         //parentheses or not.
         if (properlyNested) {
            System.out.print(expression + " is properly nested with parenthesis.");
         }

         else {
            System.out.print(expression + " is NOT properly nested with parenthesis.");
         }

         System.out.println("\n");
         System.out.print("Want to continue with another expression? [y or n]: ");
         keep_going = scan.nextLine();
      }
   }
}
