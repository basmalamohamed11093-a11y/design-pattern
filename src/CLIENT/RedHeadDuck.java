package CLIENT;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Squeak;

public class RedHeadDuck extends duck  {


    public RedHeadDuck()
    {
        fLyBehavior= new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }
}