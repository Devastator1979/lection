package lection14;
class Calc{
        
    int summ(int a, int b){
        int summ;
        summ = a+b;
        return summ;
    }
    int minus(int a, int b){
        int minus;
        minus = a-b;
        return minus;
    }
    double dln(int a, int b){
        double dln;
        dln = (a*1.0)/b;
        return dln;
    }
    int umn(int a, int b){
        int umn;
        umn = a*b;
        return umn;
    }
    int znak(int a){
        return -a;
    }
    int masMin(int [] ar){
        int min = ar[0];
        for(int i=0;i<ar.length;i++){
            if (min>ar[i])
            min = ar[i];
            
        }        
        return min;
    }
    int masMax(int [] ar){
        int max = ar[0];
        for(int i=0;i<ar.length;i++){
            if (max<ar[i])
            max = ar[i];
            
        }        
        return max;
    }
}
public class Task05 {
    public static void main(String arg[]){
        Calc sum1 = new Calc();
        System.out.println(sum1.summ(2, 3));

        System.out.println(sum1.minus(2, 3));

        System.out.println(sum1.dln(2, 9));

        System.out.println(sum1.umn(2, 3));

        System.out.println(sum1.znak(-2));

        int ar [] = {5, 6, 8 , 10 ,4 ,8,15,1};
        System.out.println("minMas = "+ sum1.masMin(ar));
        System.out.println("maxMin = " + sum1.masMax(ar));
        
    }
}
