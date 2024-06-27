package afternoon.memory;

public class CounterMain {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

//       모두 다른 인스턴스이기 떄문에 전부 1이 나온다.
//       static을 붙이면 counter3은 3이 나온다.
        System.out.println("Counter : " + counter3.counter);
    }
}
