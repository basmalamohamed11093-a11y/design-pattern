package Observer2;

public class EmailAlert implements TourObserver {
    private final Tour tour;
    public EmailAlert(Tour tour) { this.tour = tour; tour.subscribe(this); }

    public void update() {
        System.out.println("[Email] " + tour.getName() + " now costs " + tour.getPrice() + " EGP");
    }
}
