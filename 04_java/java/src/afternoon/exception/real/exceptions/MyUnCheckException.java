package afternoon.exception.real.exceptions;

// UnCheckException (예외 처리해보기)
// ★★★핵심★★★ RuntimeException 을 상속 받으면 에러 처리를 하지 않아도 된다. (?)
// 모든 에러를 위로 보낸 다음 
// Service 클래스에서 모든 에러를 효율적으로 처리한다.
public class MyUnCheckException extends RuntimeException {

    public MyUnCheckException(String message) {
        // 부모 호출
        super(message);


    }
}
