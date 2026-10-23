package SingleTon;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = LoginService.getInstance();
        Page homePage = new HomePage();

        homePage.Pagecomponent();
        System.out.println("Logged entries: " + loginService.listExceptions());
    }




}
