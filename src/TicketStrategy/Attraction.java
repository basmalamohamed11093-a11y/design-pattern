package TicketStrategy;

public class Attraction {
    private final String name;
    private final double basePrice;
    private PricingStrategy pricingStrategy; 

    public Attraction(String name, double basePrice, PricingStrategy strategy) {
        this.name = name;
        this.basePrice = basePrice;
        this.pricingStrategy = strategy;
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;         
    }

    public void printTicket() {
        double price = pricingStrategy.calculate(basePrice); 
        System.out.println(name + " ticket: " + price + " EGP");
    }
}
