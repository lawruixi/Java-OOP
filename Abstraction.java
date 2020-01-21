import java.lang.Math;
public class Abstraction{
    public static void main(String[] args){
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(10, 10);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}

abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    double area(){
        return 3.14159*radius*radius;
    }
}

class Rectangle extends Shape{
    int width, breadth;
    Rectangle(int width, int breadth){
        this.width = width;
        this.breadth = breadth;
    }
    double area(){
        return this.width * this.breadth;
    }
}
