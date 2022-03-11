public class Main {

    public static void main(String[] args) {


        Garage garage = new Garage("myGarage");
        garage.addCar(new ElCar("BE82926","Tesla", 2010,4,2000,150,200));
        garage.addCar(new DieselCar("UY43265","ford", 2010,4,true,14));
        garage.addCar(new DieselCar("LK87699","BMW", 2010,4,false,5));
        garage.addCar(new GasCar("TG45623","Mercedes", 2010,4,2000,9));
        garage.addCar(new GasCar("VF76297","Kia", 2010,4,2000,25));
        garage.addCar(new GasCar("JH76355","Toyota", 2010,4,2000,14));

        System.out.println(garage);
        garage.calcGreenTaxesForCars();
    }
}
