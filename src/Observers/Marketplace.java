package Observers;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Marketplace {
    private final Map<EventType, List<Observer>> subscribers =
            new EnumMap<>(EventType.class);
    private final List<Product> products = new ArrayList<>();
    private final List<Offer> offers = new ArrayList<>();

    public Marketplace() {
        for (EventType eventType : EventType.values()) {
            subscribers.put(eventType, new ArrayList<>());
        }
    }

    public void registerObserver(EventType eventType, Observer observer) {
        List<Observer> eventSubscribers = subscribers.get(eventType);
        if (!eventSubscribers.contains(observer)) {
            eventSubscribers.add(observer);
        }
    }

    public void removeObserver(EventType eventType, Observer observer) {
        subscribers.get(eventType).remove(observer);
    }

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(
                EventType.NEW_PRODUCT,
                "New product: " + product.getName() + " for " + product.getPrice() + " EGP");
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        notifyObservers(EventType.NEW_OFFER, "New offer: " + offer.getMessage());
    }

    private void notifyObservers(EventType eventType, String message) {
        for (Observer observer : new ArrayList<>(subscribers.get(eventType))) {
            observer.update(message);
        }
    }
}
