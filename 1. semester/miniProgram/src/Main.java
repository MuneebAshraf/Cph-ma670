import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String random = " {field_name : value }";

        System.out.println(random.indexOf("{"));
        System.out.println(random.indexOf(":"));
        System.out.println(random.lastIndexOf("}"));

    }
}
