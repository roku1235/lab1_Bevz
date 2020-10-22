import java.lang.System;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bobik", 5);
        Dog d2 = new Dog("Kesha", 8);
        Dog d3 = new Dog("Goka");

        d3.setAge(7);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
