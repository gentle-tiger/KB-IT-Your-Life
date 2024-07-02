package afternoon.nested.local;
// 중요 ★★★★★★★
public class LocalOuter2 {
    // 멤버변수
    private String outerInstance = "outerInstance";

    // 메서드
    public void outerMethod(String methodParameter) {
        // 지역 변수
        String methodString = outerInstance;

        class LocalInner implements Print{
            String localInstance = "localInstance";

            // 중첩 클래스던 지역 클래스던 인터페이스를 구현할 수 있다.
            @Override
            public void printLocal() {
                //
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);

                //
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        }
        // 메서드 내에서 실행해야 methidParameter가 사라지지 않음으로 메서드 내부에서 사용해야한다.
        LocalInner localInner = new LocalInner();
        localInner.printLocal();

    }
    // 메서드와 동일
    public static void main(String[] args) {
        LocalOuter2 localOuter = new LocalOuter2();
        localOuter.outerMethod("methodParameter");
    }


}
