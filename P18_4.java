/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: This program prints the maximum element
 * of an array of type Measurable by using a static method
 * in a generic class called MeasurableTwo
 * Citation: None
 */

import java.util.ArrayList;

public class P18_4 {
    public static void main(String[] args) {
        //create an array list of type MeasurableTwo
        ArrayList<MeasurableTwo> numList = new ArrayList<>();
        //add elements in the array using MeasurableTwo constructor
        numList.add(new MeasurableTwo<Integer>(3));
        numList.add(new MeasurableTwo<Integer>(6));
        numList.add(new MeasurableTwo<Integer>(9));

        //call the findMax static method to find the maximum value
        //of the array
        MeasurableTwo maxNumber = MeasurableTwo.findMax(numList);
        //print value on the console
        System.out.println("Largest Element: " + maxNumber.toString());
    }
}
