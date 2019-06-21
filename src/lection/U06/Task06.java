package lection.U06;
public class Task06 {
    public static void main(String[] args) {
        // StringBuilder и StringBuffer изменяемые объекты строки,
        // все изменения можно применять к самому объекуту.
        StringBuffer str = new StringBuffer ("Hello ");
        str.append("World!!!");
                System.out.println("str = " + str);
    }
    
}
