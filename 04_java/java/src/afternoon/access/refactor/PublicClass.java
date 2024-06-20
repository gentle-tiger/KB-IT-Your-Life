package afternoon.access.refactor;

public class PublicClass {
    public static void main(String[] args) {

//        public 클래스는 하나여야 한다.
//        자기 자신을 직접 호출한다. 같은 클래스면 private 도 접근 가능하다.
        PublicClass pc = new PublicClass();

//        DefaultClass1 dc1 = new DefaultClass1();
//        DefaultClass2 dc2 = new DefaultClass2();
    }
}

//class DefaultClass1(){};
//class DefaultClass2(){};
