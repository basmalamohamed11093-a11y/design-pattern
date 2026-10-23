package Decorator2;

public abstract class AddOnDecorator extends TourPackage {
    TourPackage tour;

    public abstract String getDescription();
}