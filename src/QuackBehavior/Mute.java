package QuackBehavior;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("i cant talk ");
    }
    
}
