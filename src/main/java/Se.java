import java.util.Scanner;

public class Se {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


        int hap = 0;

        for(i =0 ; i<101 ; i++){
            if((i % 3 ==0) || (i%5 ==0)) {
                hap += i;
            }
        }

    }
}



//public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//
//int hap =0;
//int num1 ;
//int k;
//
//if( a >0 && a <101)
//
// if (k%3==0 %%  k%5==0)
//    for( i =num1 ; i<101, i=+k) {
//      hap +=i
//}
//else
//    system.out.println("잘못입력했습니다")
//
//  system.out.println("+hap")
//}