package Sigleton2;

public class PriceFormatter {
    public String format(double amount) {
        AppConfig config = AppConfig.getInstance();
        return amount + " " + config.getCurrency();
    }
}