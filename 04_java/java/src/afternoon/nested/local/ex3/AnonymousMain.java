package afternoon.nested.local.ex3;

public class AnonymousMain {
    public static void main(String[] args) {

        // 일반적인 hello 인터페이스 구현
//        Hello hello = new Hello(){
//            @Override
//            public void hello(){
//                System.out.println("hello world");
//            }
//        };

        // 람다 함수로 hello 인터페이스 구현
        Hello hello = () -> {
            System.out.println("hello world");
        };

        // 호출하는 시점이 중요.
        hello.hello();
    }
}
