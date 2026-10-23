package Decorator2;

public class PhotoPackage extends AddOnDecorator {
    public PhotoPackage(TourPackage tour) {
        this.tour = tour;
    }

    public String getDescription() {
        return tour.getDescription() + ", Photo Package";
    }

    public double cost() {
        return tour.cost() + 120;
    }
}