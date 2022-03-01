import java.util.*;

/**
 * Question1
 */
public class Question1 {
    public static void addAndSort(LinkedList<Integer> list, int value) {
        list.add(value);
        Collections.sort(list);
    }
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));

        Scanner input = new Scanner(System.in);
        System.out.println("Insert an integer: ");
        int i = input.nextInt();
        input.close();

        System.out.println("Before: " + linkedList);

        addAndSort(linkedList,i);

        System.out.println("After: " + linkedList);
    }
}
