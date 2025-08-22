package OOPs.Abstraction;

abstract class Vehicle{
   public abstract void engine();
   public void sound(){
        System.out.println("Dark loud");
    }
}

class Wagon extends Vehicle{
    public void engine(){
        System.out.println("Starting...");
    }

    public void sound(){
        System.out.println("Dark loud");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Whats going on");
        Vehicle v = new Wag();
        v.engine();
        v.sound();
    }
    
}
