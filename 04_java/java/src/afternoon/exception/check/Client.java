package afternoon.exception.check;

import java.util.Random;

public class Client {
    public void callException() throws MyCheckException {
        // 예외를 던졌기 때문에 throw를 붙여야 한다.
        // 개발자가 명시적으로 처리하지 않으면 빨간줄이 뜬다.
        throw new MyCheckException("Client.call에서 에러 발생");

    }

    public void callRandException() throws MyCheckException2 {
        Random rand = new Random();
        boolean luck = rand.nextBoolean();

        if (luck) {
            throw new MyCheckException2("Client.callRandException 발생 + 운도 없네^^");
        } else {
            System.out.println("오늘은 운이 좋으시군요.");
        }
    }
}
