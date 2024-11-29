class Node{
    int data;
    Node next;
    Node pre;

    Node(int data1 , Node next1, Node pre1){
        this.data=data1;
        this.next=next1;
        this.pre= pre1;
    }

    Node(int data1){
        this.data= data1;
        this.next = null;
        this.pre = null;
    }
}
public class Add2Linkedlist {
    private static Node Add2Linkedlist(Node l1, Node l2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
         int carry =0;
 
        
        while( (l1 != null || l2 != null) || carry == 1) {
            int sum = 0; 
            if(l1 != null) {
                sum += l1.data; 
                l1 = l1.next; 
            }
            
            if(l2 != null) {
                sum += l2.data; 
                l2 = l2.next; 
            }
            
            sum += carry; 
            carry = sum / 10; 
            Node node = new Node(sum % 10); 
            temp.next = node; 
            temp = temp.next; 
        }
        return dummyNode.next; 
    }





    //     while( t1 != null || t2 != null ){
    //         int sum = carry;
    //         if(t1) sum = sum + t1.data;
    //         if(t2) sum = sum + t2.data;
    //         Node newNode = new Node(sum % 10);
    //         carry = sum/10;
    //         curr.next = newNode;
    //         curr =curr.next;

    //         if(t1) t1 = t1.next;
    //         if(t2) t2 = t2.next;
    //     }
    //     if(carry){
    //         Node newNode1 = new Node(carry);
    //         curr.next = newNode1;
    //     }

    // return dummyNode.next;
    // }
 private static Node convertArr(int [] arr){
    Node head = new Node(arr[0]);
    Node move = head;
    for(int i =0; i< arr.length; i++){
        Node temp = new Node(arr[i]);
        move.next = temp;
        move = temp;
    }
    return head;
 }
 private static Node convertArr1(int [] arr1){
    Node head = new Node(arr1[0]);
    Node move = head;
    for(int i =0; i< arr1.length; i++){
        Node temp = new Node(arr1[i]);
        move.next = temp;
        move = temp;
    }
    return head;
 }



    public static void main(String[] args) {
        int arr [] = {2,4,6};
        int arr1 [] = {3,8,7};
        Node head1 = convertArr(arr);
        Node head2 = convertArr(arr1);
        Node  sum  = head1 + head2;
        sum = Add2Linkedlist(head);


         System.out.println(sum );
}
}
