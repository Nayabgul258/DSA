class Node {
    int data;
    Node next;
     
    Node (int data1,Node next1){
        this.data = data1;
        this. next = next1;
        }
     Node(int data1){
        this.data = data1;
        this.next = null;
     }   
}
public class Linkedlist1 {
private static Node convertArr(int arr[]){
    Node head = new Node (arr[0]);
    Node mover = head;
    for(int i=1 ; i< arr.length; i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
   } 
private static  void print(Node head){
    while(head != null){
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
}

private static int  Lengthofll(Node head){
   int cnt =0;
   Node temp = head;
   while(temp != null){
    temp = temp.next;
    cnt = cnt +1;
   }
   return cnt;
}

   public static void main(String[] args) {
    int arr [] = {4,6,2,7,5,9,10};
    Node head = convertArr(arr);
    System.out.println(Lengthofll(head));
   }
}
