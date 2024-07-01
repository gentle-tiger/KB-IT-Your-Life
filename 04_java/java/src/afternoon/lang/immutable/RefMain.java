package afternoon.lang.immutable;

// 불변 객체 - 원시형과 참조형의 차이
public class RefMain {
    public static void main(String[] args) {
       User user1 = new User("호진");

       User user2 = user1;


        System.out.println("user1 = " + user1); // 호진
        System.out.println("user2 = " + user2); // 호진

        user2.setName("연지");
        System.out.println("user2 의 이름을 연지로 변경");
//       user1, user2 둘 다 User를 가리키고 있기 때문에 두 객체 모두 name의 값이 변경된다.
        System.out.println("user1 = " + user1); // 연지
        System.out.println("user2 = " + user2); // 연지

    }
}
