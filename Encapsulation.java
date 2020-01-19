public class Encapsulation{
    private int x = 1;

    int getX(){
        return x;
    }

    public static void main(String[] args){
        Encapsulation e  = new Encapsulation();
        System.out.println(e.getX());
    }
}
