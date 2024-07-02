package afternoon.nested.nested;

// 중첩 클래스
public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance"; // 인스턴스를 해야만 접근이 가능

    //    중첩 클래스
    static class Nested {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() {
            // 클래스 내부의 static에 접근 -> 내부 외부 접근 가능
            System.out.println("nestedStatic = " + nestedStatic);// 왜 접근이 가능할까? 동일 클래스 + 인스턴스 x 접근 가능
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static(인스턴스)에 접근 -> 내부 인스턴스는 가능 / 외부 인스턴스는 불가능 ★★★
            System.out.println("nestedInstance = " + nestedInstance);
//            System.out.println("outerInstance = " + outerInstance); // 안에 있는 것처럼 보이지만 다른 인스턴스에 존재한다.
        }

    }


}
