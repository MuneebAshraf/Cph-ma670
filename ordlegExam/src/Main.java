import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> input = new ArrayList<>();

        input.add("Hello");
        input.add("World");
        String x = 'test';
        x.l

        try {
            Ordleg ordleg = new Ordleg();
            System.out.println(ordleg.gentagOrd(input, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
