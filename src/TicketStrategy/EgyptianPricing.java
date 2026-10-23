package TicketStrategy;

public class EgyptianPricing implements PricingStrategy {
    public double calculate(double basePrice) {
        return basePrice * 0.20;    
    }
}
