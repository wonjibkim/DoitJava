package Exam;

public class Exam08_06 {
    public static void main(String[] args) {
        int aa[]={10,20,30,40,50};
        int count,size;

        count=aa.length; ///
        size=count*Integer.BYTES; //int타입은 각각 4비트 크기를 가짐...

        System.out.printf("배열 aa[ ]의 요소의 개수는 %d 개 입니다. \n", count);
        System.out.printf("배열 aa[ ]의 요소의 전체 크기는 %d 바이트 입니다. \n", size);

        for(int i=0; i<aa.length;i++){
            System.out.println("aa["+i+"] : "+aa[i]);
        }


    }
}
