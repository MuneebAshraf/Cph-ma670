public class Sorting {

    public static void main(String[] args) {
        int[] ints = { 32,17,44,2,5,13,62,8 };

        sort(ints);
    }

    public static void sort(int[] ints) {
        int counter = 0;
        int length = ints.length;
        while (counter <= length) {

            for (int i = 0 ; i < length ; i++) {
                int a = ints[i];

                if (i == length-1){
                    break;
                }
                int b = ints[i + 1];

                if ( a > b ) {
                    ints[i] = b;
                    ints[i+1] = a;
                    counter = 0;
                } else {
                    counter++;
                }
            }

        }
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
