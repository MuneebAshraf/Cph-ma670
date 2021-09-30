import java.util.Random;

public class Terning {

    private int Ojne = new Random().nextInt(1,7);

    public Terning() {

    }

    public int kast() {
         return Ojne = new Random().nextInt(1,7);
    }

    public int getOjne() {
        return Ojne;
    }
}
