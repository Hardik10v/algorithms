public class ReverseLL {
    
    public static void main(String[] args){
        reverseLL();
    }

    private  static  void reverseLL(){

        Node<Integer> head= new Node<>(0);
        Node curNode=head;

       for(int i=1;i<10;i++){
         curNode.next=new Node(i);
         curNode=curNode.next;
       }
       travese(head);
    //  reverse

    
        
    }

    private static  void travese(Node head){
        Node curNode=head;
        while (curNode !=null) { 
            System.out.println(curNode.data);
            curNode=curNode.next;
        }
    }
}
