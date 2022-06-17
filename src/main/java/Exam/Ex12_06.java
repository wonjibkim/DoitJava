package Exam;

class Car{
    int speed =0;

    void upSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재속도(슈퍼클래스) :" + this.speed);
    }
    }
    class sedan extends Car {
    void upSpeed(int speed){

        this.speed +=speed;
        if (this.speed > 150);
    }
    }



public class Ex12_06 {
}
