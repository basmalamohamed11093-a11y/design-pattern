package Decorator2;

public class Lunch extends AddOnDecorator {
    public Lunch(TourPackage tour) {
        this.tour = tour;
    }

    public String getDescription() {
        return tour.getDescription() + ", Lunch";
    }

    public double cost() {
        return tour.cost() + 150;
    }
}
