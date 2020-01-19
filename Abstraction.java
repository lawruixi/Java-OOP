import java.lang.Math;
public class Abstraction{
    static double square(double x){
        return x * x;
    }
    static double sqrt(double x){
        return Math.sqrt(x);
    }
    static double pythagoras(double a, double b){
        return sqrt(square(a) + square(b));
    }
    public static void main(String[] args){
        System.out.println(pythagoras(3, 4));
    }
}
