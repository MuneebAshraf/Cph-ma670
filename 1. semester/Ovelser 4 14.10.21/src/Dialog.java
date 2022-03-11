import java.util.Scanner;

public class Dialog {
    private Scanner myScan;
    private double number;
    private double VAT;

    public Dialog(){
        System.out.println("Indtast varens pris: ");
        myScan = new Scanner(System.in);
        number = myScan.nextDouble();
    }

    public double getNumber() {
        return number;
    }
}
