/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: Integer and Double helper classes which
 * implement Measurable to pass double and integer
 * elements to the array in P18_1
 * Citation: None
 */

/* Helper class to parse integer values in the array
 */
public class IntegerConverter implements Measurable {
    private Integer intNum;

    //constructor which takes integer input
    public IntegerConverter(Integer intNum) { this.intNum = intNum; }

    //override getMeasure() method of Measurable interface
    @Override
    public double getMeasure() {
        return intNum;
    }
}

/* Helper class to parse double values in the array
 */
class DoubleConverter implements Measurable {
    private Double doubleNum;

    //constructor which takes double input
    public DoubleConverter(Double doubleNum) { this.doubleNum = doubleNum; }

    //override getMeasure() method of Measurable interface
    @Override
    public double getMeasure() {
        return doubleNum;
    }
}
