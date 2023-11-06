package chaper1.strategypatttern.Java;
public class MallardDuck extends Duck{
    public MallardDuck() {
        // All mallardDuck will have default following behaviors
        // but users can use setFlyBehavior and setQuackBehavior to set
        // behaviors at runtime
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Mallard duck");
    }
}
