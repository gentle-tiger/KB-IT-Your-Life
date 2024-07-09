package afternoon.collection.set;

import java.util.HashSet;
import java.util.Set;

// hashSet은 set 인터페이스를 ...
// 중복 제거, 유일한 데이터 저장, 검색이 필요한 경우에 쓴다.
// 단, 메모리를 효율을 위해 메모리를 많이 차지한다는 단점이 있다.
public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //  set은 중복을 허용하지 않는다.
        boolean isAdded = set.add(40);
        System.out.println("set 에 40 추가 = " + isAdded);// set 에 40 추가 = false
        System.out.println("set = " + set); // set = [50, 20, 40, 10, 30] 순서를 보장하지 않는다.

        // 데이터 검색
        boolean contains20 = set.contains(20); // O(1)
        boolean contains30 = set.contains(30); // O(1)
        System.out.println("contains20 = " + contains20);
        System.out.println("contains30 = " + contains30);

        // 데이터 삭제
        boolean isRemoved = set.remove(40); // O(1)
        boolean isRemoved2 = set.remove(50); // O(1)
        System.out.println("isRemoved = " + isRemoved);
        System.out.println("isRemoved2 = " + isRemoved2);

        System.out.println("set = " + set); // set = [20, 10, 30]
        System.out.println("Set size = " + set.size());// Set size = 3






    }
}
