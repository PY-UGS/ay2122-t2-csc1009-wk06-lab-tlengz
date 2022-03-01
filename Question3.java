import java.util.*;
import java.lang.Math;
public class Question3 {
    public static int findValue(LinkedList<Integer> list, int searchVal) {
        if(list.contains(searchVal)){
            return list.indexOf(searchVal);
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int min = 1000;
        int max = 9999;
        for(int i = 0; i < 500; ++i)
        {
            linkedList.add((int)((Math.random() * (max-min+1))+min));
        }
        
        System.out.println("Before: " + linkedList);
        
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("\nGenerated number: " + random_int);
        
        System.out.println("\nAfter: " + findValue(linkedList,random_int));
    }
}
