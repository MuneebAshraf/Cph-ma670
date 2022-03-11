public class GasCar extends Car{
    private int octanNumber, kmPrL;

    public GasCar(String regNr, String brand, int year, int amountOfDoors, int octanNumber, int kmPrL) {
        super(regNr, brand, year, amountOfDoors);
        this.octanNumber = octanNumber;
        this.kmPrL = kmPrL;
    }

    public int getOctanNumber() {
        return octanNumber;
    }

    public void setOctanNumber(int octanNumber) {
        this.octanNumber = octanNumber;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return super.toString() + ", octanNumber: " + octanNumber +
                ", kmPrL: " + kmPrL + "\n";
    }

    @Override
    public double greenTax() {
        double greenTax = 0;
        if (20 < kmPrL && kmPrL <= 50) {
            greenTax = 330;
        } else if (15 < kmPrL && kmPrL <= 20) {
            greenTax = 1050;
        }else if (10 < kmPrL && kmPrL <= 15) {
            greenTax = 2340;
        }else if (5 < kmPrL && kmPrL <= 10) {
            greenTax = 5500;
        }else if (kmPrL <= 5) {
            greenTax = 10470;
        }

        return greenTax;
    }

}
