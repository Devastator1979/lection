package lection24;
interface A{
    int value =3;
}
interface B{
    int value = 7;
}
class C implements A, B{
    
}
public class Task01 {
    public static void main(String arg[]){
        C c = new C();
        System.out.println(((A)c).value);
    }
}
