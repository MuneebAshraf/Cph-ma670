class Main {

    public static void main(String[]args){
        Driver me = new Driver("Muneeb",26);
        Car myCar = new Car("Mercedes","S350", "Sedan", 2020);
        myCar.setDriver(me);

        System.out.println(myCar + "" + me);

        Car myNewCar = new Car("Bentley","Deluxe", "Expensive", 3000);
        System.out.println(myNewCar + "" + me);
    }
}
