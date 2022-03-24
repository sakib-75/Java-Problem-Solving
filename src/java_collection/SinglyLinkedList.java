package java_collection;

public class SinglyLinkedList {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.printList();

        list.addLast("x");
        list.addLast("y");
        list.addLast("z");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getListSize();

    }


    Node head;
    private int size;

    SinglyLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add node
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

    // Delete node
    public void headNull_Delete() {
        if (head == null) {
            System.out.println("List is empty");
        }
    }

    public void deleteFirst() {
        headNull_Delete();
        head = head.next;
        size--;
    }

    public void deleteLast() {
        headNull_Delete();
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public void getListSize() {
        System.out.println("Linked list size: " + size);
    }

}
