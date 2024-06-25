package afternoon.poly3.casting1.ex1;

public class ex1Main {
    public static void main(String[] args) {
//     부모 요소 타입으로 자식 요소의 인스턴스를 생성
//     타입에 의해 접근이 막힘. 그것을 해결할 수 있도록 범위를 넓혀준다.
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();

//  강제 형변환(일시적인 다운 캐스팅):
//      상위 타입(Animal)에서 하위 타입(Dog, Cat)으로
//      캐스팅하여 고유 메서드를 호출할 수 있습니다.

//  강제 형변환(casting)을 사용하여 Dog와 Cat 객체의 고유 메서드(sound)를 호출합니다.

//      dog.sound(); 에러
        ((Dog) dog).sound();
        ((Cat) cat).sound();
    }
}
