import java.util.HashMap;

public class Question5 {
    public static void swapValues(HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo) {
        int value = hashMap.get(indexTwo);
        hashMap.put(indexTwo, hashMap.get(indexOne));
        hashMap.put(indexOne, value);
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        map.put(0, 1);
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 9);
        map.put(5, 11);

        System.out.println("Hashmap Before: " + map);
        
        swapValues(map, 1, 5);
        System.out.println("Hashmap After: " + map);

    }
}
