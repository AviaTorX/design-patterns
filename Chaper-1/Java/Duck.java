public abstract class Duck {

    // Design Principle: Favour composition over inheritance
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("ALl ducks can swim even decoys");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior f) {
        flyBehavior = f;
    }

    public void setQuackBehavior(QuackBehavior q) {
        quackBehavior = q;
    }
}