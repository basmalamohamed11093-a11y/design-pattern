package Observer2;

public class LowSeatsWarning implements TourObserver {
    private final Tour tour;
    public LowSeatsWarning(Tour tour) { this.tour = tour; tour.subscribe(this); }

    public void update() {
        if (tour.getSeatsLeft() <= 5) {
            System.out.println("[Warning] Only " + tour.getSeatsLeft()
                    + " seats left for " + tour.getName() + "!");
        }
    }
}
