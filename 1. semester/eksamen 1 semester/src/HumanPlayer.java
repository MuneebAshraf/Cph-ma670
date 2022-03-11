import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer implements Player{

    @Override
    public int chooseAction(String[] actions) {
        int choice = -1;
        System.out.println("Vælg en af følgende: ");

        for (int i = 1; i < actions.length; i++) {
            System.out.println(i + ") " + actions[i]);
        }

        try {
            Scanner myScan = new Scanner(System.in);
            choice = myScan.nextInt();

            return choice;

        } catch (InputMismatchException e) {
            System.out.println("skriv et tal");
        }


            return choice;
    }
}
