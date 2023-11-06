package chapter3.decoratorpattern.Java;

public class SteamedMilk extends CondimentsDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
