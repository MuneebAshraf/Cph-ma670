public class Main {

    public static void main(String[] args) {
        Room bathroom = new Room(4, 1, 5, 1);
        Room livingroom = new Room(8, 2, 4, 6);
        Room kitchen = new Room(4, 1, 3, 2);

        Room[] rooms = {bathroom, livingroom, kitchen};

        Building home = new Building(rooms, 1, 4, false);

        int sum = 0;
        for (Room room : home.getRoom()) {
            sum += room.getNumberOfLamps();
        }
        System.out.println(sum);

        if (home.getNumberOfFloors() > home.getRoom().length)
            System.out.println("This is an odd building");
    }
}

