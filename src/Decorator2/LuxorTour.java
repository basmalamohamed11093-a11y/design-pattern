package Decorator2;

public class LuxorTour extends TourPackage {
    public LuxorTour() {
        description = "Luxor Day Trip";
    }

    public double cost() {
        return 1500;
    }
}
