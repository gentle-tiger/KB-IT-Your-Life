package afternoon.exception.check;

// Exception(예외 처리해보기) exception을 상속받으면 반드시
public class MyCheckException extends Exception {

    public MyCheckException(String message) {
        // 부모 호출
        super(message);


    }
}
