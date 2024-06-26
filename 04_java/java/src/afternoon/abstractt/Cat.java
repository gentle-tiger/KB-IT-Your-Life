package afternoon.abstractt;
// abstract를 하면 무조건 오버라이딩을 해야함.
// 제약이 많을수록 좋은 코드임.
public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("고양이는 야옹");
    }
    @Override
    public void eat(){
        System.out.println("고양이가 츄르를 먹습니다.");
    }

}
