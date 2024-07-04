package afternoon.exception.uncheck;

// 빨간줄은 뜨지 않지만 프로그램을 실행하면 에러가 뜬다. trycatch 구문을 통해 에러를 확인한다.
public class Service2 {
    public static void main(String[] args) {
        Client client = new Client();
        // try 문에서도 예외가 터질 수 있다는 것을 명시함/
        try{
            client.callException();
            client.callException2();
        //  두 클래스의 공통된 메서드만 예외 처리를 할 수 있다. //
        //  두 예외 객체의 공통되는 것만 e로 받아서 사용이 가능하다.
        // 서로 다른 것을 사용하려고 하면 예외가 발생한다.
        }catch(MyUnCheckException | MyCheckException e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("막았는가?");
        }


    }
}
