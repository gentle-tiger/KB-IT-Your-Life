package afternoon.exception.real;

import afternoon.exception.real.exceptions.MyCheckException;
import afternoon.exception.real.exceptions.MyUnCheckException;

// 모든 예외를 담는 Exception으로 받는다.
//
public class Service {
    public static void main(String[] args) {

        Client client = new Client();

        try {
            client.callException();
            client.callException2();
        } catch (Exception e) {
            // 모든 예외를 처리하는 메서드 사용
            exceptionHandler(e);
        }


        System.out.println("막았는데?");
    }
    // 모든 예외를 처리할 수 있도록 Exception 타입으로 e를 받는다.
    public static void exceptionHandler(Exception e) {
        System.out.println("시스템 : 죄송...");
        System.out.println("===개발자만 보세요===");
        e.printStackTrace();

        // 에러 타입에 따라 다르게 예외 처리
        if (e instanceof MyCheckException) {
            System.out.println("MyCheckException에서 발생한 에러입니다.");
            //MyCheckException에서만 쓰는 메서드 활용을 위한 다운 캐스팅.
            MyCheckException myCheckException = (MyCheckException) e;
            myCheckException.getMessage();

        }else if(e instanceof MyUnCheckException){
            System.out.println("MyCheckException에서 발생한 에러입니다.");
            //MyCheckException에서만 쓰는 메서드 활용을 위한 다운 캐스팅.
            MyUnCheckException myUnCheckException = (MyUnCheckException) e;
            myUnCheckException.getMessage();
        }




    }
}
