package afternoon.exception.uncheck;
// 예외 처리 1
// 빨간줄은 뜨지 않지만 프로그램을 실행하면 에러가 뜬다. trycatch 구문을 통해 에러를 확인한다.
public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        // try 문에서도 예외가 터질 수 있다는 것을 명시함/
        try{
            client.callException();
            client.callException2();
        }catch(MyUnCheckException e){
            // System.out 넣으면 에러를 직접  확인할 수 있다
            e.printStackTrace(System.out);
        }catch(MyCheckException e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("막았는가?");
        }


    }
}
