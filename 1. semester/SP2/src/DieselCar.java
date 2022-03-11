public class DieselCar extends Car {
    private Boolean hasFilter;
    private int kmPrL;

    public DieselCar(String regNr, String brand, int year, int amountOfDoors, Boolean hasFilter, int kmPrL) {
        super(regNr, brand, year, amountOfDoors);
        this.hasFilter = hasFilter;
        this.kmPrL = kmPrL;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return super.toString() + ", hasfilter: " + hasFilter +
                ", kmPrL: " + kmPrL  + "\n";
    }

    @Override
    public double greenTax() {
        double greenTax = 0;

        if (20 < kmPrL && kmPrL <= 50) {
            greenTax = 330 + 130;
        } else if (15 < kmPrL && kmPrL <= 20) {
            greenTax = 1050 + 1390;
        }else if (10 < kmPrL && kmPrL <= 15) {
            greenTax = 2340 + 1850;
        }else if (5 < kmPrL && kmPrL <= 10) {
            greenTax = 5500 + 2770;
        }else if (kmPrL <= 5) {
            greenTax = 10470 + 15260;
        }

        if (!hasFilter)
            greenTax += 1000;

        return greenTax;
    }

}
