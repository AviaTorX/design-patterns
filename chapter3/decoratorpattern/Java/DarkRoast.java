package chapter3.decoratorpattern.Java;

public class DarkRoast extends Beverage {
    public String getDescription() {
        return "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
