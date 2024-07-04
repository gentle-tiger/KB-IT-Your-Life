package afternoon.exception.uncheck;

// 빨간줄은 뜨지 않지만 프로그램을 실행하면 에러가 뜬다. trycatch 구문을 통해 에러를 확인한다.
public class Service3 {
    public static void main(String[] args) {
        Client client = new Client();
        // try 문에서도 예외가 터질 수 있다는 것을 명시함/
        try{
            client.callException();
            client.callException2();
        // Exception을 사용하면 편하겠지만, 예외를 다양하게 운영하는 이유가 있다.
        // 해당 에러는 다양한 정보들을 담고 있기 떄문에 추후 디버깅 시에 유리하다.
        // 그렇기에 무분별한 Exception을 사용하는 것은 지양해야 한다.
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("막았는가?");
        }


    }
}
