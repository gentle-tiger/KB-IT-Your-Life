package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {

        User user1 = new User("최호진", "jkhh1125");
        User user2 = new User("최호진", "jkhh1125");

        System.out.println(user1 == user2); // false
//        실제 멤버변수의 값을 비교하고 싶을 떄는 equals() 메서드를 사용.
        System.out.println(user1.equals(user2)); // true
        System.out.println();
    }
}
