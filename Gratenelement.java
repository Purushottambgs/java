import javax.swing.*;
import java.sql.SQLOutput;

public class Gratenelement {
    public static void main(String[] agrs){
        int a=52, b=99, c=96, d=102;

        if (a>b && a>c && a>d ){
            System.out.println("a is grater element in all");
        } else if (b>a && b>c && b>d) {
            System.out.println("b is greter element in all");
        }
        else if (c>a && c>b && c>d){
            System.out.println("c is greter element in all");
        }
        else {
            System.out.println("d is greter element in all");
        }
    }
}
