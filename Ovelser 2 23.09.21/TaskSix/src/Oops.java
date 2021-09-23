/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *
 */
public class Oops {
    public static void main(String[] args) {
        int a = 7, b = 42;
        int smaller = minimum(a,b);         //added smaller= before minimum
        if (smaller == a) {                 //fixed from {smaller == a} to (smaller == a)
            System.out.println(a+" is the smallest!"); // moved a outside string
        }
    }
    public static int minimum(int a, int b) {       //changed return type from void to it
        int smaller =0;                             //added local referance smaller
        if (a < b) {
            smaller = a;                            //removed int smaller = a
        } else if (a >= b) {
            smaller = b;                            //removed int smaller = a
        }
        return smaller;
    }
}
