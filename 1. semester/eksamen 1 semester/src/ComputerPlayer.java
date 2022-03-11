import java.util.Random;

public class ComputerPlayer implements Player{

    @Override
    public int chooseAction(String[] actions) {
        Random rand = new Random();
        return rand.nextInt(actions.length + 1);
    }
}
