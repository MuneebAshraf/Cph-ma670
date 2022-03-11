public class Main {

    public static void main(String[] args) {
        //printEmptyline();                                   //1.b call function to print empty line
        //printThisString(args);                              //1.c call function that prints all string give through args
        printMyNameandAge(args);                            //1.d call func
    }

    public static void printEmptyline() {                   //function that prints empty line
        System.out.println();                               //print empty line
    }

    public static void printThisString(String[] input) {
        StringBuffer toBePrinted = new StringBuffer();
        for (String s : input) {
            toBePrinted.append(s).append(" ");
        }
            System.out.println(toBePrinted);
    }

    public static void printMyNameandAge(String[]input) {
        String name = input[0];
        int age = Integer.parseInt(input[1]);
        System.out.println("My name is " +name+ ", I am "+age+" years old ");
    }


}
