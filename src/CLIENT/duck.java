package CLIENT;
import FlyBehavior.FLyBehavior;
import QuackBehavior.QuackBehavior;

public abstract class duck {
    FLyBehavior fLyBehavior;
    QuackBehavior quackBehavior;

    public duck(){}
    public abstract void display();
    public void PerformQuack()
    {
        quackBehavior.quack();
    }
    public void PerformFly()
    {
        fLyBehavior.fly();
    }
    public void SetFlyBehavior (FLyBehavior f)
    {
        fLyBehavior = f;
    }
    public void SetQuackBehavior (QuackBehavior q)
    {
        quackBehavior = q;
    }
}