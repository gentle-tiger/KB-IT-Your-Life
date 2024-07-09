package afternoon.collection.list;

import java.util.ArrayList;

// ArrayList를 사용할 때


//ArrayList
//메서드에 따라 시간복잡도가 다른 이유
//add 할 때는 앞의 데이터를 뒤로 복사하고
// remove도 값을 앞으로 땡겨와야 하기 때문에 시간복잡도가 O(N)이며,
// get, set 할 때에는 O(1)의 시간복잡도를 가지는 것이다.
public class ArrayListExample {
    public static void main(String[] args) {
        //                                   <Integer> 생략
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("list = " + list);


        list.add(6);

        
    }
}
