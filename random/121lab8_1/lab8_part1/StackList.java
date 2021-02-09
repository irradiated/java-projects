// StackList.java
// Class StackList definition with composed List object.


public class StackList
{
   private List a_stack;

   // no-argument constructor
   public StackList()
   {
      a_stack = new List( "stack" );
   } // end StackComposition no-argument constructor

   // add object to stack
   public void push( Object object )
   {
      a_stack.insertAtFront( object );
   } // end method push

   // remove object from stack
   public Object pop() throws EmptyListException
   {
      return a_stack.removeFromFront();
   } // end method pop

   // determine if stack is empty
   public boolean empty()
   {
      return a_stack.isEmpty();
   } // end method isEmpty

   // output stack contents
   public void print()
   {
      a_stack.print();
   } // end method print
} // end class StackList
