public class Child extends Inheritance{
    int z;

    int getZ(){
        return z;
    }

    Child(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public static void main(String[] args){
        Child c = new Child(2, 3, 4);
        System.out.println(c.getX());
        System.out.println(c.getY());
        System.out.println(c.getZ());
    }

}
