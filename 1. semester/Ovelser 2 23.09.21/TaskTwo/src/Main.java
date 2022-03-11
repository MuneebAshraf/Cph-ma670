class Main {
    public static boolean happy = true;

    public static void main(String[] args) {

        System.out.println(sumOfTwo(Integer.parseInt(args[0]), Integer.parseInt(args[1])));             //2.b you have to give 2 numbers through terminal

        //System.out.println(toUpperCase(args[0]));                                                      //2.C you have to give a word through terminal

        //System.out.println(checkFirstLetter(args[0]));                                                //2.D you have to give a word through terminal

        /*if (iAmHappy())
        {
            System.out.println("I clap my hands");
        }
        else
        {
            System.out.println("I don't clap my hands");
        }*/
    }


    public static boolean iAmHappy() {
        // fill out what is missing here
        return happy;                                                                           // 2.a the static boolean happy wasnt being returned
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static String toUpperCase(String lowerCaseString) {
        return lowerCaseString.toUpperCase();
    }

    public static boolean checkFirstLetter(String input) {
        return Character.isUpperCase(input.charAt(0));

    }
}
