import java.util.Optional;

public class LinkedList
{
    static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    Node head , tail;
    int SIZE;

    public LinkedList()
    {
        head = tail = null;
    }

    public void add(Optional<Integer> index,int data)
    {
        Node newNode = new Node(data);
        int i =  (index.orElseGet(() -> SIZE + 1));

        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        if(i == 0)
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null && i-- != 0)
        {

        }

    }

}
