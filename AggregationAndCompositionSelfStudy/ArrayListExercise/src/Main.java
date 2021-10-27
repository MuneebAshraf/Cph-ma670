import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> motto = new ArrayList<>();
        motto.add("life");
        motto.add("is");
        motto.add("awesome");
        motto.add(2,"not");

        motto.set(2,"totally");

        for (String a: motto) {
            System.out.println(a);
            if (a.equals("not"))
                motto.remove(a);
        }

        motto.sort(Comparator.comparing(String::toString));
        for (String s : motto) {
            System.out.println(s);
        }
    }
}
