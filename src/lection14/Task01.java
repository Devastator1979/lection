/*Задача клавиатура телефона с использованием двух массивов*/
package lection14;
public class Task01 {
    public static void main(String arg[]){
        char [] digit = {'1','2','3',
                         '4','5','6',
                         '7','8','9',
                             '0'
        };
        
        String [] letters = {"", "abc", "def",
                             "ghi", "jkl","mno",
                             "pqrs", "tuv","wxyz",
                                     " "
        };
        String res ="";
        String str = "SpaceShiP  Landing";
        str = str.toLowerCase();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            /*System.out.println(ch);*/
            int groupInd = -1;
            int letterInd = -1;
            
            for(int j =0; j<letters.length;j++){
                String group = letters [j];
                int temp = group.indexOf(ch);
                if (temp!=-1){
                    groupInd = j;
                    letterInd = temp;
                }
            }
             /* System.out.print(ch + " ");
            System.out.print(groupInd + " ");
            System.out.println(letterInd + " ");*/
            int click = 0;
            while(click<= letterInd){
                res = res + digit[groupInd];
                click ++;
            }
            res = res + " ";
        }
        System.out.println(str);
        System.out.println(res);
    }
}
