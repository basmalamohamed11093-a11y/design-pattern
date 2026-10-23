package SingleTon;

public class HomePage extends Page {
    private final LoginService loginService = LoginService.getInstance();

    @Override
    public void Pagecomponent() {
        System.out.println("HomePage");
        loginService.logException("HomePage");
    }
}
