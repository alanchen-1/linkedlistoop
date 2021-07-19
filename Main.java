class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public int lengthNode(){
    return 1 + this.next.lengthNode();
  }
  public Boolean containsNode(Node n){
    if(this.data == n.data){
      return true;
    }else{
      return this.next.containsNode(n);
    }
  }
}
class Empty extends Node{
  public Empty(){
  }
  public int lengthNode(){
    return 0;
  }
  public Boolean containsNode(Node n){
    return false;
  }
}
class LinkedList {
  Node head;
  public LinkedList(){
    this.head = new Empty();
  }
  public void cons(Node n){
    n.next = this.head;
    this.head = n;
  }
  public int length(){
    return this.head.lengthNode();
  }
  public Boolean contains(int i){
    return this.head.containsNode(new Node(i));
  }
}
class Main{
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    System.out.println(ll.length());
    System.out.println(ll.contains(1));
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    ll.cons(n1);
    ll.cons(n2);
    System.out.println(ll.length());
    System.out.println(ll.contains(1));
    System.out.println(ll.contains(3));

  }
}
