package chapter3.decoratorpattern.Java;

// if you see here we are extending Beverage just for type sake
// and not for inheriting any bevhior that we are achieving by composition
// Beverage beverage;
public abstract class CondimentsDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
