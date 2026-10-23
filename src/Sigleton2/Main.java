package Sigleton2;

public class Main {
    public static void main(String[] args) {
        PriceFormatter prices = new PriceFormatter();
        WelcomeBanner banner = new WelcomeBanner();

        System.out.println(banner.text() + " | " + prices.format(800));

        AppConfig.getInstance().setLanguage("ar");       
        AppConfig.getInstance().setCurrency("USD");

        System.out.println(banner.text() + " | " + prices.format(800));   
    }
}