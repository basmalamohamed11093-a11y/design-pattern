package Decorator2;

public class TourGuide extends AddOnDecorator {
    public TourGuide(TourPackage tour) {
        this.tour = tour;
    }

    public String getDescription() {
        return tour.getDescription() + ", Tour Guide";
    }

    public double cost() {
        return tour.cost() + 200;
    }
}
