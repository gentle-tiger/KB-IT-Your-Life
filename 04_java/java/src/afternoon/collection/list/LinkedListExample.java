package afternoon.collection.list;

import java.util.LinkedList;

// linkedList
// lint를 최상위로 두고 있기 때문에 ArrayList에서 사용한
// 메서드를 동일하게 사용할 수 있다.


// 조회가 빈번하며 ArrayList
// 삭제 추가가 빈번하면 LinkedList 를 사용한다.

public class LinkedListExample {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // LinkedList 가 제일 유리한 케이스
        list.addFirst(1);
        // 둘이 동일한 케이스
        list.addLast(6);

        // 3 번째 데이터를 22로 바꾼다. 동작횟수는 1부터 index 까지가 된다. O(N)
        list.add(3, 22);

        // list = [1, 1, 2, 22, 3, 4, 5, 6, 6]
        System.out.println("list = " + list);

        // 검색
        // 첫 번째와 마지막은 알고 있기 때문에 O(1)이 걸린다.
        int firstElement = list.getFirst();
        int lastElement = list.getLast();


        // 검색
        // 1부터 찾아가기 때문에 오래 걸린다.
        int firstElement1 = list.getFirst();
        int lastElement2 = list.getLast();
        int midElement = list.get(4);


    }
}
