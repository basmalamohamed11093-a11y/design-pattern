package Observer2;
public class Main {
    public static void main(String[] args) {
        Tour luxor = new Tour("Luxor Day Trip", 1500, 20);

        EmailAlert email = new EmailAlert(luxor);
        new AdminDashboard(luxor);
        new LowSeatsWarning(luxor);

        luxor.updateTour(1400, 12);
        System.out.println("--- email unsubscribes ---");
        luxor.unsubscribe(email);
        luxor.updateTour(1300, 4);
    }
}
