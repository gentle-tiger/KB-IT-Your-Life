package afternoon.poly3.overriding.ex1;


public class AnimalMain {
    public static void main(String[] args) {

        Animal[] animals = {new Animal(), new Dog(), new Cat(), new Duck()};

//      animals 배열에 있는 각 Animal 객체에 대해 반복하며 animal 변수에 할당한다.
        for(Animal animal : animals){
            animalCall(animal);
        }
    }
//    animal 의 주소값이 들어온다.
    public static void animalCall(Animal animal){
        animal.sound();
//      animal 객체가 Duck 클래스의 인스턴스인지 확인한다.
//      (인스턴스 instanceof 클래스)
        if(animal instanceof Duck){
//          Animal 타입을 Duck 타입으로 Down casting 후 fly() 메서드 호출
            ((Duck) animal).fly();
        }
    }
}
