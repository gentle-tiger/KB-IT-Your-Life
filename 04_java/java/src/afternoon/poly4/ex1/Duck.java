package afternoon.poly4.ex1;

public class Duck implements Animal, Fly {

    @Override
    public void eat() {
        System.out.println("오리가 밥을 먹습니다!");
    }

    @Override
    public void sound(){
        System.out.println("오리가 꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

}
