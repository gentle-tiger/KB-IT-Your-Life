package afternoon.exception.real;


import afternoon.exception.real.exceptions.MyCheckException;
import afternoon.exception.real.exceptions.MyUnCheckException;

public class Client {
    // throws를 안 붙이는 이유는 runtime이기 떄문에 자동을 상위 객체에 던져진다.
    public void callException(){
        throw new MyCheckException("MyCheckException");
    }

    public void callException2(){
        throw new MyUnCheckException("MyUnCheckException");
    }

}
