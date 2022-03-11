import java.util.ArrayList;

public class Ordleg {


    ArrayList<String> gentagOrd(ArrayList<String> input, int k) throws IllegalAccessException {
        if (input == null || k < 1 )
            throw new IllegalAccessException("ugyldigt input");

        ArrayList<String> output = new ArrayList<>();
        for (String ord : input) {
            for (int i = 0; i < k; i++) {
                output.add(ord);
            }
        }
        return output;
    }
}
