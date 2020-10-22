import java.lang.System;

public class Ball {

    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0;
    }

    public Ball() {
        color = "Red";
        radius = 12;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return this.color + " ball has a radius of " + this.radius;
    }

    public void volumeOfBall() {
        System.out.println(color + " color ball is " + "ball has a radius is" + (5.0/4.0) * Math.PI * radius*radius);
    }

}
