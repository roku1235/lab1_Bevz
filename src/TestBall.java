import java.lang.System;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball("Red", 10);
        Ball b2 = new Ball("Green", 25);
        Ball b3 = new Ball("Black");

        b3.setRadius(12);

        System.out.println(b1);

        b1.volumeOfBall();
        b2.volumeOfBall();
        b3.volumeOfBall();
    }
}
