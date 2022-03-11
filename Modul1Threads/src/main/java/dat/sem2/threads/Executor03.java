package dat.sem2.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 The purpose of Executor03 is to...

 @author kasper
 */
public class Executor03 {

    public static void main( String[] args ) {
        //ExecutorService workingJack = Executors.newSingleThreadExecutor();
        ExecutorService workingJack = Executors.newFixedThreadPool( 4);
        System.out.println( "Main starts" );

        for (char letter = 'A'; letter <= 'Z' ; letter++) {
            String printThis = String.valueOf(letter) + letter + letter;
            Runnable task = new MyTask( printThis );
            workingJack.submit( task );
        }

        /*for ( int count = 0; count < 25; count++ ) {
            Runnable task = new MyTask( count );
            workingJack.submit( task );
        }*/
        System.out.println( "Main is done" );
        workingJack.shutdown();
    }

}

class MyTask implements Runnable {

    //private int count = 0;
    private String string;

    //MyTask( int cnt ) {
    MyTask( String toBePrinted ) {
        //count = cnt;
        string = toBePrinted;
    }

    @Override
    public void run() {
        //System.out.println( "Task: " + count );
        System.out.println( "Task: " + string );
    }
}
