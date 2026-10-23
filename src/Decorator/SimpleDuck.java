package Decorator;
public class SimpleDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Simple Duck Quack");
    }

    @Override
    public void swim() {
        System.out.println("Simple Duck Swimming");
    }

    @Override
    public void move() {
        System.out.println("Simple Duck Moving");
    }
}
