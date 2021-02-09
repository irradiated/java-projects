// QueueList.java
//
// Class QueueList definition with composed List object.
//Edited by: Dakota Flath


public class QueueList
{
   private List a_queue;

   public QueueList()
   {
      a_queue = new List( "queue" );
   }

   public Object peek() throws EmptyListException
   {
   	if (a_queue.isEmpty())
   		return null;
   	else
   		return a_queue.getFirstObject();
   }

   public void print()
   {
      a_queue.print();
   }

   //implement the enqueue(), dequeue() and empty() methods below:
   public void enqueue(Object object) {
      a_queue.insertAtBack(object);
   }

   public Object dequeue() throws EmptyListException {
      return a_queue.removeFromFront();
   }

   public boolean empty() {
      return a_queue.isEmpty();
   }


}