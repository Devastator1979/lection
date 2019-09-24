//Начало левая нижняя попасть в правый верхний угол.
//Не должен выпасть за пределы мира и чтобы не попал в препятствие.
//Препятствия должны раставляться рандомно с процентным задаваемым соотношением.
//В конце игры игра подсчитывает колличество ходов пройденых до нужного места.
// Класс поле класс марио клас игра game.
package lection24;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//import static java.lang.Math.random;

class Field{
    int field [][] = new int [10][10];
    void init(int p){
        //int i;
        for (int i=0;i<field.length; i++){
            for(int j=0;j<field.length;j++){
              double rand = (Math.random()*100);
              if(rand<p){
                  field [i][j]=1;
              }
            }
        }
    }
    void print(){
        for (int i=0;i<field.length; i++){
            for(int j=0;j<field.length;j++){
              System.out.print(field[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
class Mario{
    int x;
    int y;
}
class Game{
    int getDirection(){
        int direction=0;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        }
        catch(IOException ex){
            System.out.println("Ошибка ввода!!");
        }
        return direction;
    }
    
}
public class Task02 {
    public static void main(String arg[]){
        Field k = new Field();
        k.init(30);
        k.print();
    }
    
}
