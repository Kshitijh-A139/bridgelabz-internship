public class StackQueueAPI {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    System.out.println("Stack Operations:");

    list.push(70);
    list.push(30);
    list.push(56);

    list.displayStack();

    System.out.println("Peek from stack: " + list.peek());

    System.out.println("Pop from stack: " + list.pop());
    System.out.println("Pop from stack: " + list.pop());
    System.out.println("Pop from stack: " + list.pop());
    
    list.displayStack();

    System.out.println("\nQueue Operations:");
    list.enqueue(56);
    list.enqueue(30);
    list.enqueue(70);

    list.displayQueue();

    System.out.println("Dequeue: " + list.dequeue());

    list.displayQueue();
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
  Node top;
  Node front;
  Node rear;

  public void push(int data) {
    Node newNode = new Node(data);

    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  public int pop() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    }

    return top.data;
  }

  public int peek() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    }

    return top.data;
  }

  public void displayStack() {
    if (top == null) {
      System.out.println("Stack is empty");
      return;
    }

    Node temp = top;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

    System.out.println("null");
  }

  public void enqueue(int data) {
    Node newNode = new Node(data);

    if (front == null) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public int dequeue() {
    if (front == null) {
      System.out.println("Queue is empty");
      return -1;
    }

    int data = front.data;
    front = front.next;

    if (front == null) {
      rear = null;
    }

    return data;
  }

  public void displayQueue() {
    if (front == null) {
      System.out.println("Queue is empty");
      return;
    }

    Node temp = front;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

    System.out.println("null");
  }
}