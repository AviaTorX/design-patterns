package chaper1.strategypatttern.Java;

// Design Principle: Seprate out what varies in this case
// Duck was having fly behavior which was varying based on duck type
// we can different fly behaviors different algorithms
// so different duck has different flying algorithm
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Soaring through sky that means flying");
    }
}
