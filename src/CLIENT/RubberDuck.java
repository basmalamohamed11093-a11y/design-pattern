package CLIENT;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Mute;

public class RubberDuck extends duck  {
    public RubberDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Mute();
    }
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
