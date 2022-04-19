import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int a = scan.nextInt();

        for(int i=0 ; i<a; i++){
            for (int k=0; k<=i ; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
