package lection.U06;
public class Task07 {
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder sb = new StringBuilder("01234567");
        sb.insert(4, "----");
        System.out.println(sb);
        sb.delete(4, 8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(3, 5, "XXXX");
        System.out.println(sb);
    }
    
}
