class Node {
  int data;
  Node next;
  Node prev;
  public Node(){
      this.data = 0;
      this.next = null;
      this.prev = null;
  }
  public Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
  }
  public Node(int data, Node next, Node prev){
      this.data = data;
      this.next = next;
      this.prev = prev;
  }
  public int lengthNode(){
      return 1 + this.next.lengthNode();
  }
}
class TailNode extends Node{
  int data;
  Node next;
  Node prev;
  public TailNode(){
    super();
  }
  public TailNode(int data){
    super(data);
  }
  public int lengthNode(){
    return 1;
  }
}
class LinkedList{
  Node head;
  Node tail;
  public int length(){
      return head.lengthNode();
  }
  public void add(int data){
    Node n = new TailNode(data);
    Node convert = new Node(this.tail.data, n, this.tail.prev);
    n.prev = convert;
    this.tail.prev.next = convert;
    this.tail = n;
  }
  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public LinkedList(Node head, Node tail){
    this.head = head;
    this.head.next = tail;
    this.tail = tail;
    this.tail.prev = head;
  }
}
class Empty extends LinkedList {
  public Empty(){
    super();
  }
  public int length(){
    return 0;
  }
}
class Main{
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new TailNode(2);
    LinkedList test = new LinkedList(n1, n2);
    System.out.println(test.length());
    int newVal = 4;
    test.add(newVal);
    test.add(newVal);
    test.add(newVal);
    test.add(newVal);
    System.out.println(test.length());
    LinkedList test2 = new Empty();
    System.out.println(test2.length());
  }
}

