package afternoon.abstractt;
// abstract를 하면 무조건 오버라이딩을 해야함.
// 제약이 많을수록 좋은 코드임.
public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("강아지는 멍멍");
    }
    @Override
    public void eat(){
        System.out.println("강아지가 사료를 먹습니다.");
    }
}
