/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: This program prints the minimum and maximum
 * elements of an array of type Measurable by using a generic
 * method called PairUtil.minmax
 * Citation: None
 */

public class P18_1 {
    public static void main(String[] args) {
        //create an array of type Measurable
        Measurable[] numList = new Measurable[4];
        //add integer and double elements into the array
        numList[0] = new IntegerConverter(3);
        numList[1] = new DoubleConverter(5.5);
        numList[2] = new DoubleConverter(99.0);
        numList[3] = new IntegerConverter(1);

        //call the minmax generic method to find the minimum and
        //maximum pair
        Pair<Measurable, Measurable> pair = PairUtil.minmax(numList);
        //print the result on the console
        System.out.println("(" + pair.getFirst().getMeasure() + ", " +
                pair.getSecond().getMeasure() + ")");
    }
}
