package lection28;
class Node{
    Node ref;
    int date;
}
class List{
    String head;
    void add(String ref, int date){
        
    }
}
public class Task02 {
    public static void main(String args[]){
        Node head;
        Node n1 = new Node();
        head = n1;
        n1.ref = null;
        n1.date = 35;
        Node n2 = new Node();
        n2.ref = null;
        n2.date = 48;
        n1.ref = n2;
        Node n3 = new Node();
        n3.ref = null;
        n3.date = 54;
        n2.ref = n3;
        add(100,head);
        print(head);
        
        
    }
    static void print(Node head){
        Node kursor = head;
        while(kursor.ref!=null){
            System.out.println(kursor.date);
            kursor = kursor.ref;
        }
        System.out.println(kursor.date);
    }
    static void add (int date, Node head){
        Node kursor = head;
        while(kursor.ref!=null){
            //System.out.println(kursor.date);
            kursor = kursor.ref;
        }
        Node n = new Node();
        n.ref = null;
        n.date = date;
        kursor.ref = n;
    }
}
