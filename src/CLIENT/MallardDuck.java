package CLIENT;
import FlyBehavior.FlyNoWay;
import QuackBehavior.Quack;

public class MallardDuck  extends duck {

    public MallardDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

}
