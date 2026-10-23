package Sigleton2;

public class AppConfig {
    private static AppConfig uniqueInstance;

    private String language = "en";
    private String currency = "EGP";

    private AppConfig() {
        System.out.println("(AppConfig created)");
    }

    public static synchronized AppConfig getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AppConfig();
        }
        return uniqueInstance;
    }

    public String getLanguage() { return language; }
    public String getCurrency() { return currency; }
    public void setLanguage(String language) { this.language = language; }
    public void setCurrency(String currency) { this.currency = currency; }
}