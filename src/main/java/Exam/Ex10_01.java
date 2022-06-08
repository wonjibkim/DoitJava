package Exam;

public class Ex10_01 {
    public static void main(String[] args) {
        int[]aa = new int[3]; // 배열의 크기가 3
        try{
            aa[3] = 100; // 배열의 크기가 4 일때 가능한 배열을 요구 즉 의도적인 에러메세지 출력
        }catch (ArrayIndexOutOfBoundsException e){ // 배열을 크기를 넘기고 값을 넣었을 때 나오는 에러  외웊필요 x
                                                   // 개발할 때 에러를 잡기위해서 로그기록을 본다.
            System.out.println("배열의 첨자가 배열 크기보다 커요~~"); // 에러가 뜨면 출력되는 구문
            System.out.println("에러 메세지 : " +e); //에러메세지 원인
        }
    }
}
