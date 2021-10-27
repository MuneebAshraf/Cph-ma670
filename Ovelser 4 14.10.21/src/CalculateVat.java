public class CalculateVat {
    private final int PRCVAT = 25;
    private Double VAT;

    public CalculateVat(double number) {
        VAT = number / 100 * PRCVAT;
    }

    public Double getVAT() {
        return VAT;
    }
}
