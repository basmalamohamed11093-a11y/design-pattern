package Decorator2;

public abstract class TourPackage {
    String description = "Unknown Tour";

    public String getDescription() { return description; }
    public abstract double cost();
}
