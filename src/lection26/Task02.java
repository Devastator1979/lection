package lection26;
class AsociativArray{
    int value;
    String key;
    String keyArray [] = new String[100];
    int valueArray [] = new int[100];
    void Add(String key, int value){
        for (int i=0; i<keyArray.length;i++){
            if(keyArray[i]==key){
                System.out.println("Ключ " + key + " уже есть в массиве ");
                break;
            }
            if(keyArray[i]==null){
                keyArray[i]=key;
                valueArray[i]=value;
                break;
            }
        }
    }
    void getread (String key){
        for(int i = 0; i<keyArray.length;i++){
            if(keyArray[i]==key){
                System.out.println("под ключом " + key + " находится число " + valueArray[i]);
            }
        }
    }
    void print1(){
        for (int i=0; i<keyArray.length;i++){
            if(keyArray[i]!=null){
                System.out.print(keyArray[i] + " ");
                System.out.println(valueArray[i] + " ");
            }
        }
    }
    
}
public class Task02 {
    public static void main(String args[]){
        AsociativArray ar1 = new AsociativArray();
        ar1.Add("abc", 52);
        ar1.Add("d", 10);
        //ar1.Add("abc", 52);
        ar1.Add("xyz", 107);
        ar1.getread("abc");
        
        ar1.print1();
        //System.out.println(ar1.keyArray[0] + " " + ar1.valueArray[0]);
        //System.out.println(ar1.keyArray[1] + " " + ar1.valueArray[1]);
        //System.out.println(ar1.keyArray[2] + " " + ar1.valueArray[2]);
    }
}