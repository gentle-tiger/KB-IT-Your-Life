package afternoon.exception.basic.ex1;

//  ClassCastException 예외 처리
public class Ex1Main {
    // 중첩 클래스
    static class Parent {
    }
    // 중첩 클래스 (?)
    static class Child extends Parent {
        void childMethod() {
            System.out.println("Child.childMethod");
        }
    }
    // 실행 메서드
    public static void main(String[] args) {
        try {
            // parent인스턴스는  child 인스턴스가 없는데 child 메서드를 사용하려고 해서 생기는 에러
            Parent parent = new Parent();
            Child poly = (Child) parent;
            poly.childMethod();
            // 런타임 에러 (컴파일 에러가 아님)
        } catch (ClassCastException e) {
            System.out.println("예외 처리 완료");
            e.printStackTrace();
        }

    }
}
