public class LinkedListMain {
  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.addFirst(70);
    list.addFirst(30);
    list.addFirst(56);

    list.display();

    list.addLast(90);
    list.display();

    list.insertAfter(30, 40);
    list.display();

    list.deleteFirst();
    list.display();

    list.deleteLast();
    list.display();

    boolean found = list.search(40);
    System.out.println("Is 40 present? " + found);

    list.deleteNode(40);
    list.display();
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;

  public void append(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = newNode;
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }

    current.next = newNode;
  }

  public void insertAfter(int key, int data) {
    Node temp = head;

    while (temp != null && temp.data != key) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("Node not found:");
      return;
    }

    Node newNode = new Node(data);
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }

    head = head.next;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }

    if (head.next == null) {
      head = null;
      return;
    }

    Node temp = head;

    while (temp.next.next != null) {
      temp = temp.next;
    }

    temp.next = null;
  }

  public boolean search(int key) {
    Node temp = head;

    while (temp != null) {
      if (temp.data == key) {
        return true;
      }

      temp = temp.next;
    }

    return false;
  }

  public void deleteNode(int key) {
    if (head == null) {
      return;
    }

    if (head.data == key) {
      head = head.next;
      return;
    }

    Node temp = head;

    while (temp.next != null && temp.next.data != key) {
      temp = temp.next;
    }

    if (temp.next == null) {
      System.out.println("Node not found.");
      return;
    }

    temp.next = temp.next.next;
  }

  public void display() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }

    System.out.println("null");
  }
}