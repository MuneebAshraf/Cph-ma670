public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] actions = {"Attack", "Use spell", "Drink potion", "Run"};

        Player hplayer = new HumanPlayer();

        int hchoice = hplayer.chooseAction(actions);
        if ( hchoice != -1 )
            System.out.println("You have chosen: " + actions[hchoice]);
        else
            System.out.println("Der skete en fejl");

        Player cplayer = new ComputerPlayer();
        int cchoice = cplayer.chooseAction(actions);
        System.out.println("Computer have chosen: " + actions[cchoice]);
    }
}
