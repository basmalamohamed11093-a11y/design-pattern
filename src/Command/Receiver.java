package Command;
public class Receiver {
    private final int id;
    private int money = 0;

    public Receiver(int id) {
        this.id = id;
    }

    public void sendMoney(int money) {
        this.money += money;
        System.out.println("Receiver " + this.id + " Total money = " + this.money);
    }
}