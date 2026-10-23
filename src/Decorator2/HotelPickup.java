package Decorator2;

public class HotelPickup extends AddOnDecorator {
    public HotelPickup(TourPackage tour) {
        this.tour = tour;
    }

    public String getDescription() {
        return tour.getDescription() + ", Hotel Pickup";
    }

    public double cost() {
        return tour.cost() + 100;
    }
}