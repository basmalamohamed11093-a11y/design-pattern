package Decorator;

public abstract class DuckDecortor extends Duck {
    protected Duck decoratedDuck;

    public DuckDecortor(Duck decoratedDuck) {
        this.decoratedDuck = decoratedDuck;
    }

    @Override
    public void quack() {
        decoratedDuck.quack();
    }

    @Override
    public void swim() {
        decoratedDuck.swim();
    }

    @Override
    public void move() {
        decoratedDuck.move();
    }
    
}
