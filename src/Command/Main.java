package Command;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Invoker osama = new Invoker();
        Receiver amAly = new Receiver(0);

        SendMoneyCommand sendMoneyCommand = new SendMoneyCommand(amAly);
        osama.execute(sendMoneyCommand);

        System.out.println("Second Scenario --->");
        Receiver amMohsen = new Receiver(1);
        Receiver amIbrahim = new Receiver(2);

        ArrayList<Receiver> receiversList = new ArrayList<>();
        receiversList.add(amAly);
        receiversList.add(amIbrahim);
        receiversList.add(amMohsen);

        SendMoneyToAllCommand sendMoneyToAllCommand = new SendMoneyToAllCommand(receiversList);
        osama.execute(sendMoneyToAllCommand);
    }
}