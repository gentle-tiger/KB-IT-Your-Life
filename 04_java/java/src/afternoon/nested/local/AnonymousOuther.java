package afternoon.nested.local;
// 익명 클래스 ★★
public class AnonymousOuther {
    // 멤버변수
    private String outerInstance = "outerInstance";



    // 메서드
    public void outerMethod(String methodParameter) {
        // 지역 변수
        String methodString = outerInstance;

        // Print 인터페이스 구현
        Print print = new Print() {
            String localInstance = "localInstance";

            @Override
            public void printLocal() {
                //
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                //
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        };
        print.printLocal();
    }

            // 중첩 클래스던 지역 클래스던 인터페이스를 구현할 수 있다.

        // 메서드 내에서 실행해야 methidParameter가 사라지지 않음으로 메서드 내부에서 사용해야한다.
//        LocalInner localInner = new LocalInner();
//        localInner.printLocal();

//    }

    // 메서드와 동일
    public static void main(String[] args) {
        AnonymousOuther anonymousOuther = new AnonymousOuther();
        anonymousOuther.outerMethod("methodParameter");
    }


}
