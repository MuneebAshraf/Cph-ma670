public class ElCar extends Car{
    private  int batteriCapacityKWh, maxKm, whPrKm;

    public ElCar(String regNr, String brand, int year, int amountOfDoors, int batteriCapacityKWh, int maxKm, int whPrKm) {
        super(regNr, brand, year, amountOfDoors);
        this.batteriCapacityKWh = batteriCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriCapacityKWh() {
        return batteriCapacityKWh;
    }

    public void setBatteriCapacityKWh(int batteriCapacityKWh) {
        this.batteriCapacityKWh = batteriCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return super.toString() + ", batteriCapacityKWh: " + batteriCapacityKWh +
                ", maxKm: " + maxKm +
                ", whPrKm: " + whPrKm  + "\n";
    }

    @Override
    public double greenTax() {
        double kmPrL = 100/(whPrKm/91.25);
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
