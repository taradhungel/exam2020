import java.util.LinkedList;
public class MainClass {
    public static void main (String [] args){

    Node head = null;

    LinkedLists list = new LinkedLists();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.insert(20);
    list.insert(25);
    list.insert(35);
    list.insertAtStart(1);
    list.insertAtAnyLocation(1,40);
    list.insertAtAnyLocation(8,45);
    list.insertAtAnyLocation(9,50);
    list.insertAtEnd(10);
    list.insertAtEnd(100);
    list.insertAtEnd(2222222);


   // System.out.println("The size of the nodes that got deleted is: " + list.DeleteCount());
   // list.deleteAll();

  //  list.removeFistNode (head);
  //   for (Node temp = head; temp != null; temp = temp.next)
  //       System.out.println(temp.data + " ");
  //   System.out.println("All the node will be deleted ");


    System.out.println("The size of the linked list is : " + list.getCount());

    list.deleteAt(0);




    list.show();





    }
}
