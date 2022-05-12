package Star;
import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
     for(int h=1; h<=3; h++){
        for (int c=1; c<=3-h; c++) {
             System.out.print(" ");
        }
        for (int c=1; c<=h*2-1;c++){
            System.out.print("*");
        }
         System.out.println();
     }



     }
    }