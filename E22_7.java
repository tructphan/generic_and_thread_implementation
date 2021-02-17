/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: This program counts the word in one or more
 * files passed as arguments, prints the counts and the combined
 * count using threads
 * Citation: None
 */

public class E22_7 {
    public static void main(String[] args) {
        //if there is no arguments passed, print warning and exit
        if (args.length == 0) {
            System.out.println("No arguments detected. Please use " +
                    "the following prompt: java E22_7 <filename>...");
            System.exit(0);
        }

        //array of type Runnable to hold the arguments
        WordCount[] files = new WordCount[args.length];
        //array of type Thread to hold the threads
        Thread[] threads = new Thread[args.length];

        //loop through the thread array
        for (int i=0; i<threads.length; i++) {
            //store argument into Runnable array
            files[i] = new WordCount(args[i]);
            //create a new thread by passing Runnable object
            //into thread's constructor
            threads[i] = new Thread(files[i]);
            //start current thread
            threads[i].start();
        }

        //try-catch for Interrupted Exception
        try {
            //loop through the thread array
            for (int j=0; j<threads.length; j++)
                //use join() method to allow one thread to
                //complete before executing another
                threads[j].join();
        } catch (InterruptedException exception) {
            //print stack trace if exception occurs
            exception.printStackTrace();
        }

        //loop through the thread array
        for (int k=0; k<threads.length; k++)
            //print each file's name and word count on the console
            System.out.println(files[k].getFileName() + ": " +
                    files[k].getCount());

        //print the combined word count on the console by calling
        //static method of WordCount class
        System.out.println("Combined count: " +
                WordCount.getTotalCount());
    }
}