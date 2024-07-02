package afternoon.nested.local.ex2;

public class OuterClass3 {

    public void myMethod(){
        // 지역 클래스
         class LocalClass{

            public void hello(){
                System.out.println("안녕하세요 지역 클래스 hello 입니다.");
            }

        }
        // 아래의 코드가 이해가 잘 안 감. 메서드가 종료되기 전에 실행한다는 건 알겠는데...
        LocalClass localClass = new LocalClass();
         localClass.hello();
    }
}
