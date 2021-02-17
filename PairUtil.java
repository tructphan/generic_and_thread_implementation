/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: A class that contains a generic method which computes
 * the minimum and maximum elements of an array of generic type T
 * Citation: None
 */

/* PairUtil class which implements generic method to find min-max
 */
public class PairUtil {
    /* minmax - generic method that extends Measurable interface and
     * computes minimum and maximum values of an array
     * @param - T[] array: an array of genetic type T
     * @return - Pair<T, T>: a pair of minimum and maximum values
     */
    public static <T extends Measurable> Pair<T, T> minmax(T[] array) {
        //if the array is empty, return null values
        if (array==null)
            return new Pair<T, T>(null, null);

        //otherwise, set the min and max values to the array's first element
        T min = array[0];
        T max = array[0];
        //loop through the array
        for (T number : array) {
            //if current value is less than min, set current value to min
            if (number.getMeasure() < min.getMeasure())
                min = number;
            //if current value is more than max, set current value to max
            if (number.getMeasure() > max.getMeasure())
                max = number;
        }

        //return min-max pair
        return new Pair<T, T>(min, max);
    }
}
