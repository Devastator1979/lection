package lection.U06;
public class Task02 {
    public static void main(String[] args) {
        // При создании строки через New  то в любом случае создается новый объект,
        // иначе строка проверяется на пристутствие ее в пуле и если там такая строка есть
        // то присваивается только адрес от существующей уже строки
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello";
        String str4 = "Hello";
        String str5 = new String("World");
        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        System.out.println(str2 == str5);
        
    }
    
}
