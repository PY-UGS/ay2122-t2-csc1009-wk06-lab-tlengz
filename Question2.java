import java.util.*;

/**
 * Question2
 */
public class Question2 {
    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {
        Collections.swap(list, indexOne, indexTwo);
    }
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));

        System.out.println("Before: " + linkedList);

        swapValues(linkedList, 1, 5);

        System.out.println("After: " + linkedList);
    }

}