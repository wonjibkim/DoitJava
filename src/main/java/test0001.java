public class test0001 {

    public static void main(String[] args) {

        int i;
        int k;
        for(i=0 ; i<6; i++){
            for(k=0; k<6; i++){
                System.out.println(i);
                System.out.printf("*");
                if(i > 100) {
                    break;                }
            }
            System.out.println("");
        }

    }
}
      /* for(i=0 ; i<6; i++){
            for(k=0; k<6; i++){
                System.out.printf("*");
            }
            System.out.println("");
        }*/
// 반복되는 이유 궁금한데 일단 해봄 => 두번째 for문에 증감식이 실수로 i로 들어가있는데 왜 무한반복인지 궁금해요 주교수님
