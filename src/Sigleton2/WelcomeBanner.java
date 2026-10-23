package Sigleton2;

public class WelcomeBanner {
    public String text() {
        AppConfig config = AppConfig.getInstance();      
        return config.getLanguage().equals("ar") ? "أهلاً بك في مصر" : "Welcome to Egypt";
    }
}
