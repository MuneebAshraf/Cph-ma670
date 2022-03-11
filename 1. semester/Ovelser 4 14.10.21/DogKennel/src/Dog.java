import java.util.ArrayList;

public class Dog {
    private String name;
    private Owner owner;
    private boolean isHungry = true;
    private ArrayList<String> offSpring;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();
    }

    public String feedDog() {
        isHungry = false;
        return "The dog has been fed";
    }

    public void setOffSpring(String offSpring) {
        this.offSpring.add(offSpring);
    }

    public void setOwner(String owner) {
        this.owner = new Owner(owner);
    }

    public ArrayList<String> getOffSpring() {
        return offSpring;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}
