package afternoon.nested.local.ex2;
// 지역 클래스
public class OuterClass3Main {

    public static void main(String[] args) {
        // 실행할 때에는 LocalClass 종속관계인 OuterClass3를 인스턴스화해서 실행한다.
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.myMethod();

    }
}
