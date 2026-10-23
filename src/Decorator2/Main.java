package Decorator2;

public class Main {
    public static void main(String[] args) {
        TourPackage t1 = new PyramidsTour();
        System.out.println(t1.getDescription() + " = " + t1.cost() + " EGP");

        TourPackage t2 = new PyramidsTour();
        t2 = new TourGuide(t2);
        t2 = new Lunch(t2);
        System.out.println(t2.getDescription() + " = " + t2.cost() + " EGP");

        TourPackage t3 = new LuxorTour();
        t3 = new HotelPickup(t3);
        t3 = new PhotoPackage(t3);
        t3 = new PhotoPackage(t3); 
        System.out.println(t3.getDescription() + " = " + t3.cost() + " EGP");
    }
}