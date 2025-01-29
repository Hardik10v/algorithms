public class LinkedListCustom {
    
    public static void main(String[] args) {
        Node<Integer> head= new Node<>(0);
       initializeLL(head);
       trverseLL(head);
       deleteFromHead(head);
       deleteLastNode(head);
       deleteMiddleNode(head,3);
       insertFromHead(head);
       insertLastNode(head);
       insertMiddleNode(head,3);
    }

    private static void initializeLL(Node head){
       
        Node<Integer> node= head;
        for (int i = 1; i < 10; i++) {
            Node<Integer> childNode= new Node<>(i);
            node.next= childNode;
            node=node.next;       
        }
        System.out.println(node.data);
    }

    private  static  void trverseLL(Node head){
        Node currNode= head;
        while (currNode!=null) { 
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }

    private static void deleteFromHead(Node head){
        System.out.println("Delete head");
        head=head.next;
        trverseLL(head);
    }

    private  static void deleteLastNode(Node head){
        System.out.println("Delete last node");
           Node curNode=head;
           Node prNode=head;
           while (curNode.next !=null) { 
               prNode=curNode;
               curNode= curNode.next;
           }
           prNode.next=null;
           trverseLL(head);

    }

    private static void deleteMiddleNode(Node head, int index){
        System.out.println("Delete from middle");
        int count=0;
        Node curNode=head;
        Node prNode=head;
        while (curNode !=null) { 
            if(count==index){
                  prNode.next=curNode.next;
                  break;
            }
            else{
                prNode=curNode;
                curNode=curNode.next;
                count++;
            }
        }

        trverseLL(head);

    }

    private static void insertFromHead(Node head){
        System.out.println("Insert at beginning");
          Node<Integer> newNode=new Node<>(100);
          Node cuNode=head;
          head= newNode;
          head.next=cuNode;
          trverseLL(head);

    }

    private  static void insertLastNode(Node head){
        System.out.println("insert last node");
        Node<Integer> newNode= new Node<>(101);
        Node curNode= head;
        Node prNode=head;
        while(curNode !=null){
            prNode=curNode;
            curNode=curNode.next;
        }
        prNode.next=newNode;
        trverseLL(head);


    }

    private static void insertMiddleNode(Node head,int index){

        System.out.println("Insert Middle Node");
         Node<Integer> newNode= new Node<>(500);
        Node curNode=head;
        Node prNode=head;
         int cnt=0;
        while (curNode!=null) { 
            if(index==cnt){
              newNode.next=curNode;
              prNode.next=newNode;
              break;
            }
            else{
                prNode=curNode;
                curNode=curNode.next;
                cnt++;
            }
        }
    trverseLL(head);
        
    }
}
