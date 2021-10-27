import java.util.ArrayList;

public class Garage {
    private String name;
    private ArrayList<Car> cars;

    public Garage(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public String toString() {

       String print = "Garage: \n" + "name: " + name + '\n' + "It has the following "+ cars.size() + " cars in it:"+ "\n";
        for (Car car : cars) {
            print += car;
        }
        return print;
    }

    public void calcGreenTaxesForCars() {
        double totalGreenTax = 0;
        for (Car car : cars) {
            totalGreenTax += car.greenTax();

            if (car instanceof DieselCar && !((DieselCar) car).getHasFilter())
                System.out.println("The " +car.getBrand() +" "+ car.getRegNr() + " costs: " + car.greenTax() +" kr. in greentax + additional fees + missing particlefilter" );
            else if (car instanceof DieselCar)
                System.out.println("The " +car.getBrand() +" "+ car.getRegNr() + " costs: " + car.greenTax() +" kr. in greentax + additional fees" );
            else
                System.out.println("The " +car.getBrand() +" "+ car.getRegNr() + " costs: " + car.greenTax() +" kr. in greentax" );
        }
        System.out.println("The total is: " + totalGreenTax + " kr. in greentax (and additional fees)");
    }
}
