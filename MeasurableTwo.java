/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: A generic class that contains a static method
 * which computes the maximum value of an array list of generic
 * type T
 * Citation: None
 */

import java.util.ArrayList;

/* MeasurableTwo generic class which implements Measurable interface
 * and implements a method to find maximum value of an aray
 */
public class MeasurableTwo<T> implements Measurable {
    private T num;
    //public constructor which takes generic type input
    public MeasurableTwo(T num) { this.num = num; }

    /* findMax - finds the maximum value in an array of generic type T
     * @param - ArrayList<T> array: an array list of genetic type T
     * @return - T: the maximum value
     */
    public static <T extends Measurable> T findMax(ArrayList<T> array) {
        //if the array is empty, return null value
        if (array==null)
            return null;

        //otherwise, set the min value to the array's first element
        T max = array.get(0);
        //loop through the array
        for (T number : array) {
            //if current value is more than max, set current value to max
            if (number.getMeasure() > max.getMeasure())
                max = number;
        }

        //return max value
        return max;
    }

    /* getMeasure() - gets double value of generic type T of
     *                Measurable interface
     * @param - none
     * @return - a double value
     */
    @Override
    public double getMeasure() {
        //Since T uses wrapper classes (Integer and Double),
        //we have to cast to primitive types to return

        //if value is an integer, cast to primitive int first,
        //then cast to primitive double
        if (num.getClass().getName() == "java.lang.Integer")
            return (double)(int)num;

        //if value is a double, cast to primitive double
        return (double)num;
    }

    /* toString() - convert generic input to String for printing
     * @param - none
     * @return - none
     */
    @Override
    public String toString() {
        return num.toString();
    }
}
