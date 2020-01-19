public class RuntimePolymorphism{
    public static void main(String[] args){
        Child[] arr = {new Child1(), new Child2(), new Child3()};
        for(Child c : arr){
            c.abc();
        }
    }
}

interface Child{
    public void abc();
}
class Child1 implements Child{
    public void abc(){
        System.out.println("Child1");
    }
} 
class Child2 implements Child{
    public void abc(){
        System.out.println("Child2");
    }
}
class Child3 implements Child{
    public void abc(){
        System.out.println("Child3");
    }
}
