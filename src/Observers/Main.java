package Observers;

public class Main {
    public static void main(String[] args) {
        Marketplace marketplace = new Marketplace();

        User ahmed = new User("Ahmed");
        User mona = new User("Mona");
        User omar = new User("Omar");

        marketplace.registerObserver(EventType.NEW_PRODUCT, ahmed);
        marketplace.registerObserver(EventType.NEW_OFFER, mona);
        marketplace.registerObserver(EventType.NEW_PRODUCT, omar);
        marketplace.registerObserver(EventType.NEW_OFFER, omar);

        marketplace.addProduct(new Product("Camera", 250.0));
        marketplace.addOffer(new Offer("10% off all accessories"));
    }
}
