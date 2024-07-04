package afternoon.exception.real.exceptions;


// 다중 예외 처리 ~~
public class MyCheckException extends RuntimeException {

    public MyCheckException(String message) {
        // 부모 호출
        super(message);


    }
}
