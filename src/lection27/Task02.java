//Собственные класы исключений

package lection27;
class UserException extends Exception{
    public UserException(){
        super();
    }
    public UserException(String descr){
        super(descr);
    }
}
public class Task02 {
    public static void main(String arg[]){
        try{
            int a=8;
            int b=0;
            if(b==0){
                throw new UserException();
            }
            System.out.println(a/b);
        }
        catch(UserException descr){
            descr.printStackTrace();
        }
    }
}
