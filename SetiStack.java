/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Seti Ngabo
* @version 1.0
* @since   2022-09-27
*/

import java.util.ArrayList;

/**
 * This is a class for my program.
 */
public class SetiStack {

    /**
     * Private array (only accessible within this class).
     */
    private ArrayList<Integer> stackNum = new ArrayList<Integer>();

    /**
     * This is a function for the pushed item.
     *
     * @param userInt the number thats added to the array.
     *
     */
    public void push(final int userInt) {
        stackNum.add(userInt);
    }

    /**
     * Finalizing the stack.
     */
    public void finishedStack() {
        System.out.println(stackNum);
    }
}
