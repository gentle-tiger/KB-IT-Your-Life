package afternoon.lang.wrapper;

// 원시형 데이터
public class CompareMain {
    public static void main(String[] args) {
//        Integer a = Integer.valueOf(1);
//        Integer b = Integer.valueOf(2);

//      객체형 메서드를 사용할 수 있게 한 번 감싸준다.
//      compareTo() 메서드는 같으면 1, 다르면 -1
//        System.out.println(a.compareTo(b));

        int c = 1;
        int d = 2;
//        c.com (원시형 데이터는 compareTo() 메서드를 사용하면 에러남.)
        Integer integer1 = new Integer(1);
        Integer integer2 = Integer.valueOf(2);
        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(11.25);

        System.out.println(integer1.intValue()); // 1
        System.out.println(integer2.intValue()); // 2
        System.out.println(long1.longValue()); // 100
        System.out.println(double1.doubleValue()); // 11.25














































































































    }
}
