import java.util.Scanner;

public class test0016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();


         for ( k=1 ; k<10 ; k++)
         {
             for( int i = 1; i<10 ; i++)
             {
                 System.out.printf( "%d * %d = %d", i, k , (i *k));
             }
             System.out.println();
    }
}
}
