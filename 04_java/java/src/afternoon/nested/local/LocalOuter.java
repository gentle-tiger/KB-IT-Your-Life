package afternoon.nested.local;
// 중요 ★★★★★★★
public class LocalOuter {
    // 멤버변수
    private String outerInstance = "outerInstance";

    // 메서드
    public void outerMethod(String methodParameter) {
        // 지역 변수
        String methodString = outerInstance;

        class LocalInner {
            String localInstance = "localInstance";


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
        LocalOuter localOuter = new LocalOuter();
        localOuter.outerMethod("methodParameter");
    }


}
