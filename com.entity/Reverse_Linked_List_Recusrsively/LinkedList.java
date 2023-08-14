
public class LinkedList {
  
    Node head; // head of list
  
    // Linked list Node.
    // Node is a static nested class
    // so main() can access it
    static class Node {
  
        int data;
        Node next;
  
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
  
    // Method to insert a new node
    public static LinkedList insert(LinkedList list,
                                    int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
  
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
  
            // Insert the new_node at last node
            last.next = new_node;
        }
  
        // Return the list by head
        return list;
    }
  
    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
  
        System.out.print("LinkedList: ");
  
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
  
            // Go to next node
            currNode = currNode.next;
            
        }
         System.out.println(" ");
    }
        public static void printReverseList(Node head)
    {
        Node currNode =head;
  
        System.out.print("Reverse LinkedList: ");
  
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
  
            // Go to next node
            currNode = currNode.next;
        }
    }
  
    // **************MAIN METHOD**************
  
    // method to create a Singly linked list with n nodes
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
  
        //
        // ******INSERTION******
        //
  
        // // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
       
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next= node7;
        node7.next= null;


  
        // Print the LinkedList
        printList(list);

        System.out.println("**************************************************");
          Node head = reverseRecursively(node1);
          printReverseList(head);


    }

    public static Node reverseRecursively(Node node){

        if(node ==null||node.next ==null){

        return node;
        }
      Node head =  reverseRecursively(node.next);

      node.next.next =node;
      node.next=null;
      return head;
    }
}


