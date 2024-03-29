//Exception
//Вся обработка исключений в Java построена на использовании конструкции Try Catch Finaly
//   try{
//
//   }
//   catch{
//
//   }
//   finally{
//
//   }
// все три блока должны следовать друг за другом
// блок tray всегда в единственном экземпляре, cath может быть несколькоб
// если присутствует finaly то тоже должен быть только один
// Сокращенные формы. 2 штуки
// try{}
// catch(){}-- может быть несколько
//
// try{}
// finally{}
//Блок finaly выполняется всегда.
package lection25;
public class Task01 {
    static int bar(int n){
        int res = 0;
        try{
            if (n == 0){
        throw new ArithmeticException();
            }
            else{
                res = 10/ n;
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("From Arithm.Exc.catch method bar:" + ae);
        }
        return res;
    }
    static void foo(int n){
        bar (n);
    }
    public static void main(String args[]){
        String [] a = {"5"};
        try{
            int n = Integer.parseInt(a[0]);
            System.out.println("After parseInt()");
            foo(n);
            //System.out.println("10/n= " + (10/n));
            System.out.println("After resaults output");
            throw new RuntimeException();
        }
        catch(ArithmeticException ae){
            System.out.println("From Arithm.Exc.catch:" + ae);
        }
        catch(ArrayIndexOutOfBoundsException arre){
            System.out.println("From Array.Exc.catch:" + arre);
        }
        catch(NumberFormatException  nfe){
            System.out.println("From Number format Exe.catch:" + nfe);
        }
        catch(Throwable ex){
            System.out.println("Universal Cath: " + ex);
        }
        finally{
        System.out.println("From finally");
        }
        System.out.println("After all actions");
    }
}