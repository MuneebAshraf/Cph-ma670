public abstract class Car {
    private String regNr, brand;
    private int  year, amountOfDoors;

    public Car(String regNr, String brand, int year, int amountOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public String toString() {
        return "Car: " +
                "regNr: " + regNr +
                ", brand: " + brand +
                ", year: " + year +
                ", amountOfDoors: " + amountOfDoors;
    }

    public abstract double greenTax();
}
