package afternoon.exception.uncheck;

// throws MyUnCheckException을 지워도 에러가 생기지 않음.
// MyUnCheckException 는 uncheckException이기 때문에 굳이 처리하지 않아도 됨.
// 예외는 발생하는데 잡지 않는 것뿐이다.
public class Client {
    public void callException()  {
        throw new MyUnCheckException("Client.call에서 에러 발생");
    }

    // 빨간줄 뜨는 이유는 에러를 던져주지 않있가 떄뭉ㄴ
    public void callException2() throws MyCheckException {
        throw new MyCheckException("Client.call에서 에러 발생");
    }




}
