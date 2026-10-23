package TicketStrategy;

public class Main {
    public static void main(String[] args) {
        Attraction pyramids = new Attraction("Pyramids", 400, new ForeignerPricing());
        pyramids.printTicket();                          

        pyramids.setPricingStrategy(new StudentPricing());
        pyramids.printTicket();                          

        pyramids.setPricingStrategy(new EgyptianPricing());
        pyramids.printTicket();                           
}}