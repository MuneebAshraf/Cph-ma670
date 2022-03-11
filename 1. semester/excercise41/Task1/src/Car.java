public class Car {

    private String make;
    private String model;
    private String BodyStyle;
    private Driver Driver;
    private int Year;

    public Car(String make, String model, String bodyStyle, int year) {
        this.make = make;
        this.model = model;
        BodyStyle = bodyStyle;
        Year = year;
    }

    public Driver getDriver() {
        return Driver;
    }

    public void setDriver(Driver driver) {
        Driver = driver;
    }

    @Override
    public String toString() {
        return  "make: " + make +
                ". Model: " + model +
                " (" + Year + "), " +
                "BodyStyle: " + BodyStyle;
    }
}
