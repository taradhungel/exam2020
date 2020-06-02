public class LinkedLists {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
       // node.data = data;
        node.next = null;


        if (head == null) {
            head = node;

        }
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;

            }
            last.next = node;
        }


    }
    static Node removeFistNode (Node head){
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return head;
    }
    public  void deleteAt(int index){
        if (index==0){
            head =head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i=0;i<index; i++){
                n = n.next;
            }
            n1=n.next;
            n.next = n1.next;
        }
    }
    public void deleteAll () {
       head = null;
    }


    public void show() {
        System.out.println("The linked List are: ");
        Node node = head;
        while (node.next != null) {
            System.out.print (" " +  node.data );
            node = node.next;
        }
        System.out.print(" "+ node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;

    }
    public class insertAtEnd {
         private Node head;

         public insertAtEnd(){
             this.head = null;
        }

        }
        public Node insertAtEnd(int data) {
            if (head == null) {
                head = new Node(data);


        }
            else {
                Node node = head;
                while (node.next!= null) {
                    node =node.next;
                }
                node.next =new Node(data);
            }
            return head;

    }
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int DeleteCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }



    public void insertAtAnyLocation(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {

            Node n = head;


            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;


        }

    }
}

