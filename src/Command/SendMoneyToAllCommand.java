package Command;

import java.util.ArrayList;
import java.util.List;

public class SendMoneyToAllCommand implements Command {
    private final List<Receiver> receivers;

    public SendMoneyToAllCommand(List<Receiver> receivers) {
        this.receivers = new ArrayList<>(receivers);
    }

    @Override
    public void execute() {
        for (Receiver receiver : receivers) {
            receiver.sendMoney(500);
        }
    }
}
