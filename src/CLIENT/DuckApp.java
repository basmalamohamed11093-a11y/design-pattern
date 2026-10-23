package CLIENT;

import FlyBehavior.FlyWithWings;

public class DuckApp {
    public static void main(String[] args) {
        duck mallard = new MallardDuck();
        mallard.display();
        mallard.PerformQuack();
        mallard.PerformFly();
        mallard.SetFlyBehavior(new FlyWithWings());
        mallard.PerformFly();
    }
}