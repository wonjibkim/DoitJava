package Exam;

public class Ex10_02 {
    public static void main(String[] args) { //catch 의 중복사용문
        int[] aa = new int[3];
        try{
            aa[2] = 100 / 0; // 숫자로 0으로 나눌 수 없다
            aa[3] = 100 ; // 위에 행에서 에러가 발생되었으니까 실행이 안됨
                          // catch 는 순서대로 실행되므로 상위행일수록 범위가 적은 에러를 표현
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 첨자가 배열 크기보다 커요 ~");
            System.out.println("에러메세지 : "+e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요");
            System.out.println("에러메세지 : " + e);
        }catch (Exception e){ //에러는 Exception 에서 파생됨 즉 자바에서 발생하는 모든에러를 잡을 수 있음!
            System.out.println("에러가 나지마라...");
            System.out.println("에러메세지 : "+e);
        } finally {
            System.out.println("이 부분은 무조건 나와요 ~~");// 에러 유무 상관 없이 무조건 실행함
        }

    }
}
