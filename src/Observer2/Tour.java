package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Tour implements TourSubject {
    private final List<TourObserver> observers = new ArrayList<>();
    private final String name;
    private double price;
    private int seatsLeft;

    public Tour(String name, double price, int seatsLeft) {
        this.name = name;
        this.price = price;
        this.seatsLeft = seatsLeft;
    }

    public void subscribe(TourObserver o)   { observers.add(o); }
    public void unsubscribe(TourObserver o) { observers.remove(o); }

    public void notifyObservers() {
        for (TourObserver o : observers) {
            o.update();
        }
    }

    public void updateTour(double price, int seatsLeft) {
        this.price = price;
        this.seatsLeft = seatsLeft;
        notifyObservers();
    }

    public String getName()   { return name; }
    public double getPrice()  { return price; }
    public int getSeatsLeft() { return seatsLeft; }
}
