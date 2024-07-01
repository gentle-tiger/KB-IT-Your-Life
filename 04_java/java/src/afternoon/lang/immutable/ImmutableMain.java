package afternoon.lang.immutable;
// 불변객체 공부
public class ImmutableMain {
    public static void main(String[] args) {
//    두 인스턴스가 동일한 클래스르 바라보도록 한 것.
        ImmutableUser user1 = new  ImmutableUser(" 호진");
        ImmutableUser user2 = user1;


        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);


//       User 클래스의 name 값을 바꿀 수 없으니, 새로운 인스턴스를 생성해
//        해당 인스턴스의 user 값을 변경한다.
//        user2 = new ImmutableUser("연지");
//        user2.setName("연지") // 바뀌지 않음
        user2 = user2.setName("연지"); // 바뀐 값을 새롭게 변수에 담아 전달해야한다.
        System.out.println("user1 = " + user1); // 호진
        System.out.println("user2 = " + user2); // 연지





    }

}
