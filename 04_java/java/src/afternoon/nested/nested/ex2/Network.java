package afternoon.nested.nested.ex2;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네트워크 상태를 점검합니다.");
        Random rand = new Random();
        networkCondition = rand.nextBoolean();

        if(networkCondition) {
            System.out.println("네트워크 상태 정상");
            return true;
        }else{
            System.out.println("네트워크 상태 비정상");
            return false;
            }

    }

    public void sendMsg(String msg){
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }


//   NetworkMsg 클래스를 실행 클래스에 담는다.
//    중첩 클래스는 내부에 있어야 되고 , static을 붙힌다.★★★★★
//    내부 클래스는 반드시 static이 필요하지 않다. 
//
    public static class NetworkMsg {
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
}
