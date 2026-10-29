package Command;

public class SendMoneyCommand implements Command {
    private final Receiver receiver;

    public SendMoneyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sendMoney(500);
    }
}
