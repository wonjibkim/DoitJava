package Review;

public class review009 {
    public static void main(String[] args) {

        int i;
        int hap =0;

        for( i=1 ; i<101 ; i++)
        {
            if(i%3==0 || i%5 ==0){
                hap += i;
            }
        }
        System.out.printf("%d", hap);
    }
}
// int i;
//        int hap =0;
//
//        if(i % 3==0 || i % 5==0)
//        {
//            for( i =1 ; i <101 ; i++){
//                hap += i;
//            }
//            System.out.println("+hap");
//        }
// 안되는 이유 이해가능!
