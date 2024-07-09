package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMainMap {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 1; i <= arr.length; i++) {
            hashMap.put(i, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            hashMap.put(num, hashMap.get(num) + 1);
        }
        System.out.println("hashMap = " + hashMap);
        int sum = 0;

        for(Integer key : hashMap.values()){
            sum += key;
        }

        System.out.println("sum = " + sum);
    }
}
