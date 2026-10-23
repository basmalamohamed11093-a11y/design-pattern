package Decorator;

public class Main {
    static Duck SimpleDuck = new SimpleDuck();
    static FlyableDuckDecorator FlyableDuck = new FlyableDuckDecorator(SimpleDuck);
static FireDd FireDuck = new FireDd(FlyableDuck) {};
    public static void main(String[] args) {
      SimpleDuck.move();
     FlyableDuck.move();
 FireDuck.move();
    }
} 
