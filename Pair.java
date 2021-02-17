/* Author: Truc Phan
 * Class: CS 49J
 * Date: November 27, 2020
 * Description: This class collects a pair of elements
 * of different types.
 * Citation: Lecture 25 - CS 49J
 */

public class Pair<T, S>
{
    private T first;
    private S second;

    /**
    Constructs a pair containing two given elements.
    @param firstElement the first element
    @param secondElement the second element
    */
    public Pair(T firstElement, S secondElement)
    {
        first = firstElement;
        second = secondElement;
    }
    /**
    Gets the first element of this pair.
    @return the first element
    */
    public T getFirst() { return first; }

    /**
    Gets the second element of this pair.
    @return the second element
     */
    public S getSecond() { return second; }
}