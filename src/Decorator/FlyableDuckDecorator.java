package Decorator;

public class FlyableDuckDecorator  extends DuckDecortor {
    public FlyableDuckDecorator(Duck decoratedDuck) {
        super(decoratedDuck);
    }

    @Override
    public void move() {
        System.out.println("I can fly!");
        decoratedDuck.move();
    }
    
}
