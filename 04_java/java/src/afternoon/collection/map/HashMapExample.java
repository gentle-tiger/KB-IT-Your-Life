package afternoon.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

    //
        HashMap<String, Integer> hashMap = new HashMap<>();
      
        // key value 
        hashMap.put("사과", 10000);
        hashMap.put("바나나", 200000);
        hashMap.put("토마토", 500);
        hashMap.put("수박", 20);


        System.out.println("hashMap = " + hashMap);


        // 특정 키의 값 가져오기
        int applePrice = hashMap.get("사과");
        System.out.println("applePrice = " + applePrice);

        // 키 존재 확인
        boolean hashBanana =hashMap.containsKey("바나나");
        System.out.println("바나나 존재함? " + hashBanana);

        // 값이 존재하는지 확인
        boolean hashValue20000 = hashMap.containsValue(20000);
        System.out.println("20000원 과일 여부= " + hashValue20000);
        
        

        // 삭제
        int removedValue =hashMap.remove("수박");
        System.out.println("removedValue = " + removedValue);

        System.out.println("hashMap = " + hashMap);
    }
}
