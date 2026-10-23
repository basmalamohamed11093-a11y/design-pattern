package Observer2;

public class AdminDashboard implements TourObserver {
    private final Tour tour;
    public AdminDashboard(Tour tour) { this.tour = tour; tour.subscribe(this); }

    public void update() {
        System.out.println("[Dashboard] " + tour.getName() + " | seats left: " + tour.getSeatsLeft());
    }
}
