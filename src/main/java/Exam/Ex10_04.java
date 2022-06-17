package Exam;

public class Ex10_04 {
    public static void main(String[] args) {
        int a = 100, b=0;
        int result;

        try{
            if (b==0) { //조건을 만족하면 catch 로 던지세요
                throw new Exception("0으로 나누려고요? 안됩니다.");
            }//catch와 동일해야지 던질 수 있음!
                result = a / b;
        }catch (Exception e){
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());

            System.out.println("발생오류 : " +e.getMessage());
            System.out.println("에러메세지 : " +e);
        }
    }
}
