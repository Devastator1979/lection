package lection28;
class Node{
    Node ref;
    int date;
}
class List{
    String head;
    void add (int date, Node head){
        Node kursor = head;
        while(kursor.ref!=null){
            kursor = kursor.ref;
        }
        Node n = new Node();
        n.ref = null;
        n.date = date;
        kursor.ref = n;
    }
    void print(Node head){
        Node kursor = head;
        while(kursor.ref!=null){
            System.out.println(kursor.date);
            kursor = kursor.ref;
        }
        System.out.println(kursor.date);
    }
}
public class Task02 {
    public static void main(String args[]){
        List l = new List();
        Node n1 = new Node();
        l.add(35,n1);
        l.add(48,n1);
        l.add(54,n1);
        l.print(n1);
        
        
    }   
}
