import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        String [] navn = {"michael", "nikolaj","kristiffer","long","morten","Casper","mia" };
//
//        Set<String> stringTreeSet = new TreeSet<>(Arrays.asList(navn));
//        Set<String> StringlisteSet = new LinkedHashSet<>(Arrays.asList(navn));
//        Set<String> StringHashSet = new HashSet<>(Arrays.asList(navn));
//
//
//        stringTreeSet.add("long");
//        stringTreeSet.add("long");
//
//        StringlisteSet.add("long");
//        StringlisteSet.add("long");
//
//
//        for (String s : stringTreeSet) {
//            System.out.println(s);
//        }
//
//
//        System.out.println("\nher kommer et stringListSet\n");
//
//        for (String s : StringlisteSet) {
//            System.out.println(s);
//        }
//
//        System.out.println("\nher kommer et stringHashSet\n");
//        for (String s : StringHashSet) {
//
//            System.out.println(s);
//        }


        Map<String, Integer> mapTree = new TreeMap<>();

        /*mapTree.put("michael", 42);
        mapTree.put("nicolai", 45);
        mapTree.put("Kristoffer", 41);
        mapTree.put("morten", 43);
        mapTree.put("Casper", 43);
        mapTree.put("mia", 39);

        while (true) {
            System.out.println(mapTree.getOrDefault(getString("angiv navn"), -1 ));
        }*/


        while (true) {
            int svar = getInt("press 1 for new entry\npress 2 for lookup");
            switch (svar) {
                case 1:
                    insert(mapTree);
                    break;
                case 2:
                    System.out.println(mapTree.getOrDefault(getString("angiv navn"), -1));
                    break;
            }
        }

    }

    static void insert(Map map) {
        map.put(getString("angiv navn"), getInt("angiv skostørrelse"));
        System.out.println("Entryset indsat");

    }

    static String getString(String s) {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().toLowerCase();
    }
    static int getInt(String s) {

        while (true) {
            try {
                return Integer.parseInt(getString(s));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("skriv et tal");
            }
        }
    }
}
