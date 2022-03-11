public class View {
    private String MSG = "MOMS";
    private String CURRENCY = "Kr";

    public View(double result) {
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}

