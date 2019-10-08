package lection28;
class Node{
    Node ref;
    int date;
}
class List{
    Node head = null;
    void add (int date){
        Node kursor = head;
        if (head==null){
            head = new Node();
            head.date=date;
        }
        else{
            while(kursor.ref!=null){
                kursor = kursor.ref;
            }
            Node n = new Node();
            n.ref = null;
            n.date = date;
            kursor.ref = n;
        }     
    }
    void add (int date, int index){
        Node kursor = head;
        if (index>lenght()){
            System.out.println("Вы вышли за рамки массива");
        }
        else{
            while(kursor.ref!=null){
                kursor = kursor.ref;
            }
            Node n = new Node();
            n.ref = null;
            n.date = date;
            kursor.ref = n;
        }     
    }
    void print(){
        Node kursor = head;
        while(kursor.ref!=null){
            System.out.print(kursor.ref + " " + kursor.date + " --> ");
            kursor = kursor.ref;
        }
        System.out.println(kursor.ref + " " + kursor.date + " ");
    }
     int lenght(){
        Node kursor = head;
        int p = 0; 
        while(kursor.ref!=null){
         p++;
         kursor = kursor.ref;
        }
        p++;
        return p;
     }
}
public class Task02 {
    public static void main(String args[]){
        List l = new List();
        l.add(35);
        l.add(48);
        l.add(54);
        //l.print();
        System.out.println(l.lenght());
    }   
}
