/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: Class WordCount which implements Runnable and
 * overrides run() method to calculate the total amount of words
 * of each file in the argument array
 * Citation: None
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Runnable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WordCount implements Runnable {
    private String fileName; //store each file's name
    private int count = 0; //store each file's word count
    private final Lock threadLock = new ReentrantLock(); //lock
    //store the combined word count
    //static so there it does not change for each call
    private static int totalCount = 0;

    //constructor which takes in the file's name
    public WordCount(String fileName) { this.fileName = fileName; }

    /* run() - read through each file and count total words
     * @param - none
     * @return - none
     */
    @Override
    public void run() {
        //lock the thread
        threadLock.lock();
        //try-catch for FileNotFoundException
        try {
            //create a new file
            File file = new File(fileName);
            //pass the file to scanner
            Scanner sc = new Scanner(file);

            //while there is a next word
            while(sc.hasNext()) {
                //increment word count for each file
                count++;
                sc.next(); //move to next word
            }
        } catch (FileNotFoundException exception ) {
            //print a warning and exit
            System.out.println("File not found!");
            System.exit(0);
        } finally {
            //increment the combined word count
            totalCount += count;
            //unlock the thread
            threadLock.unlock();
        }
    }

    public String getFileName() { return fileName; }
    public int getCount() { return count; }
    public static int getTotalCount() { return totalCount; }
}
