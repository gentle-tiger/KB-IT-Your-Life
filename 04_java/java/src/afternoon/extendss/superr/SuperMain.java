package afternoon.extendss.superr;

public class SuperMain {

    public static void main(String[] args) {

        // child만 상속 받으면 부모까지 사용 가능하도록 만듦.
        Child child = new Child();

        child.superCall();
    }
}
