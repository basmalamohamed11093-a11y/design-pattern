package Decorator;

public  abstract class FireDd extends DuckDecortor {
    protected Duck decoratedDuck;

    public FireDd(Duck decoratedDuck) {
        super(decoratedDuck);
    }

    public void fire() {
        System.out.println("I can fire!");
        
    }
    
}
