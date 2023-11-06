package chapter3.decoratorpattern.Java;

public class Decaf extends Beverage{
    public String getDescription() {
        return "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
