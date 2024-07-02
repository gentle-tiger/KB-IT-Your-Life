package afternoon.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ClazzMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class clazz1 = User.class; // 1. 클래스에서 직접 조회
        Class clazz2 = new User("호진").getClass();  // 2. 인스턴스를 만들어서 조회 
        // forName() 메서드는 static
        // forName() 는 해당 클래스를 찾지 못했을 경우에 나타나는 에러에 예외처리가 필요하다. (ClassNotFoundException)
        Class clazz3 = Class.forName("afternoon.lang.clazz.User"); // 3. 문자열로 찾아서 조회

        // 모든 필드(멤버 변수)
        Field[] fields = clazz1.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        // 상위 클래스 정보 출력 (User를 상속하지 않았음에도 불구하고 묵시적 상속으로 상위클래스의 값이 Object 가 나타난다.)
        System.out.println("상위 클래스 = " + clazz1.getSuperclass());

        // 상위 인터페이스 정보 출력 (interface 가 배열이어야 하는 이유, 자바는 다중상속이 안 되지만 인터페이스는 다중 상속 가능. 그래서 배열인 것임)
        Class[] interfaces = clazz1.getInterfaces();

        for (Class i : interfaces) {
            System.out.println("상위 인터페이스 = " + i);
        }


        // Class 정보를 바탕으로 인스턴스 만들기
        User user = (User) clazz1.getDeclaredConstructor().newInstance(); // 생성자 생성 후 가져오기.
//        User user2 = new User("호진");
        System.out.println("user = " + user);


    }
}
