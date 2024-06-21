package afternoon.extendss.superrr;

public class GrandChild extends Child {

    public GrandChild(){
        // Child 생성자는 매개변수를 받고 있기 떄문에super()로 하게 되면 에러가 발생한다.
        super("호진 돌격");
        System.out.println("grandChild 생성자.");
    }

}
