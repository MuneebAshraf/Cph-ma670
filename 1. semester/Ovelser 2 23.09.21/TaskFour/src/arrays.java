import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        String[] stringArray= {"l","e","e","t"};                                    //4.a create array
        int[] intArray = {7,3,3,1};                                                 //4.a create array
        boolean[] booleanArray = {true,false,true,false};                           //4.a create array

        printStringArray(stringArray);
        printSumOfArray(intArray);
        printAvgOfArray(intArray);

       sortArray(intArray);                                                         //4.i sort array of ints
    }

    public static void printStringArray(String[] stringArray){                       //4.b print each element in array
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
    public static void printSumOfArray(int[] intArray){                              //4.c print sum of each element in array
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void printAvgOfArray(int[] intArray){                              //4.d print avg of array
        int length = intArray.length;
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        int avg = sum/length;
        System.out.println(avg);
    }

    public static int[] sortArray(int[] unSorted) {
        for (int i : unSorted){
            System.out.println(i);
        }
        Arrays.sort(unSorted);
        for (int i : unSorted){
            System.out.println(i);
        }
        return unSorted;
    }
}
