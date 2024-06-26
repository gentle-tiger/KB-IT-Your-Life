package afternoon.abstractt;
// abstract를 하면 무조건 오버라이딩을 해야함.
// 제약이 많을수록 좋은 코드임.
public class Duck extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }
    @Override
    public void eat(){
        System.out.println("오리는 도토리를 먹어요.");
    }
    public void fly(){
        System.out.println("오리 날다");
    }

}
