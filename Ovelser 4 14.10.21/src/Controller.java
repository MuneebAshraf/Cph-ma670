import java.util.Scanner;

public class Controller {
    private View view;
    private CalculateVat calculateVat;
    public Controller() {
    }

    public void runController() {
        view = new View( new CalculateVat(new Dialog().getNumber()).getVAT());
    }
}
