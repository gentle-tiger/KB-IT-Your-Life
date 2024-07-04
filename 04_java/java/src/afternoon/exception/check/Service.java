package afternoon.exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        // 정확한 에러를 처리해본다.
        try{
            client.callException();
            client.callRandException();

        }catch(MyCheckException  | MyCheckException2 e){
            e.printStackTrace();
        }
        System.out.println("막았는가?");
    }
}
