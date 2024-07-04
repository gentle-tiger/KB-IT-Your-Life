package afternoon.exception.uncheck;

// UnCheckException (예외 처리해보기)
// RuntimeException 을 상속 받으면 에러 처리를 하지 않아도 된다. (?)
public class MyUnCheckException extends RuntimeException {

    public MyUnCheckException(String message) {
        // 부모 호출
        super(message);


    }
}
