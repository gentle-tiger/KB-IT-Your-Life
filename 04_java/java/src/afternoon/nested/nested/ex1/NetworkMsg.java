package afternoon.nested.nested.ex1;

public class NetworkMsg {
    // 멤버변수
    private String msg;

    // 생성자
    public NetworkMsg(String msg) { this.msg = msg; }


    //메서드
    public void send(){
        System.out.println("네트워크 메세지를 전송합니다");
        System.out.println(this.msg);
        System.out.println("네트워크 메세지 전송 종료");
    }





}
