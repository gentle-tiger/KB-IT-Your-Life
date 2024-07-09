package afternoon.generic.method;

// 직쏘 나오는 쪽 따로 공부해보기
public class GenericQuiz <T>{

    // 1번 문제 없음. 해당 클래스가 생성될 때 quiz1도 생성되기에 T를 전달받을 수 있다.
    public T quiz1(T t){return t;}


    //되지 않음. 메서드의 생성 시점을 명확하게 알아야 함.
//    public static T quiz2(T t){}
}
