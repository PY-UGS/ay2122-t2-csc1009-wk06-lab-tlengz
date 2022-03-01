import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/

public class Question4 {

    public static void addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        //hashMap.put(hashMap.size(), value);
        //hashMap.entrySet()
        //        .stream()
        //        .sorted(Map.Entry.comparingByValue())
        //        .forEach(System.out::println);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert an integer: ");
        int i = input.nextInt();
        input.close();

        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(0, 1);
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 9);
        map.put(5, 11);
        System.out.println("Hashmap Before: " + map);
        
        
        System.out.println("Hashmap After: ");
        addAndSort(map, i);
        //System.out.print(map);
    }
}
