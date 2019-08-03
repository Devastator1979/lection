/*Два типа инициализаторов статический и объектный 
    У инициализаторов нет имени
    инициализаторы ничего не возвращают
    Инициализаторы ничего не принимают
    Инициализаторы выполняются автоматически
    Объектные инициализаторы создаются при создании копии объекта
    и каждый раз при создании новой копии объекта
    Статический объект создается один раз при запуске программы
    
    Используются для подготовки объекта к работе(задание начальных
    значений переменных для класса)*/
package lection15;
class SmallInit {
    static int x;
    int y; 
    {
        y=6;
        System.out.println("1 Y=6");
    }
    //Конструктор
     static {
        System.out.println("1 Static X=55");
        x=55;
    }
    SmallInit(){
        super();
        System.out.println("Constructor");
        y=15;
    }
    {
        y=89;
        System.out.println("2 Y=89");
    }
    /*Статический инициализатор*/
    static {
        System.out.println("2 Static X=7");
        x=7;
    }
    /*Объектный инициализатор*/
    {
        System.out.println("3 Y=8");
        y=8;
    }
    static {
        System.out.println("3 Static X=88");
        x=88;
    }
    
    }
public class Task01 {
    public static void main(String arg[]){
        System.out.println(SmallInit.x);
       // SmallInit small = new SmallInit();
       // System.out.println(small.y);
    }
}
