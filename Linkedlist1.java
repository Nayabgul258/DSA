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
private static  void Print(Node head){
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
private static int checkPresent(Node head, int val){
    Node temp = head;
    while(temp != null ){
        if(temp.data == val ) return 1;
         temp = temp.next;
    }
    return 0;
}
   public static void main(String[] args) {
    int arr [] = {4,5,2,7,5,9,10};
    Node head = convertArr(arr);
     System.out.println(checkPresent(head, 2));
   }
}

