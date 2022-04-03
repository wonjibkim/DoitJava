import java.util.Scanner;

public class Codeup068 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();

        if (90 <= a && 100 >= a)
            System.out.println("A");
        else if (90 > a && 70 <= a)
            System.out.println("B");
        else if (70 > a && 40 <= a)
            System.out.println("C");
        else if (40 > a && 0 <= 0)
            System.out.println("D");

    }
}
