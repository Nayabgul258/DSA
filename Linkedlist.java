class Node{
    
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

 };  

public class Linkedlist {
  public static void main(String args[]){
    int arr [] = {4,6,2,7};
    Node Arr = new Node(arr[3]);
    System.out.print(Arr.data); 
  }
};

