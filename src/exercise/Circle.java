package exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

//    public double getRadius() {
//        return radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class TestCirCle {
    public static void main(String[] args) {
        Circle a1 = new Circle(1.0);
        Circle a2 = new Circle(5.0,"red");
        System.out.println(a1.getArea());
        System.out.println(a1.getPerimeter());
        System.out.println(a2.getArea());
        System.out.println(a2.getPerimeter());
    }
}

