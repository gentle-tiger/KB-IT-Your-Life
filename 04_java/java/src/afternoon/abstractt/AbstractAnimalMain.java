package afternoon.abstractt;

public class AbstractAnimalMain {
    public static void main(String[] args) {

//      모든 클래스를 받을 수 있는 타입은 AbstractAnimal이다.
        AbstractAnimal[] animals = new AbstractAnimal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();

//  static으로  선언한 animalCall 메서드에 매개변수로 객체를 넣어서 실행한다.
//  animalCall() 메서드는 animal이라는 객체를 매개변수로 받아
//  해당 객체가 가진 eat(), sound() 메서드를 실행한다.
        for(AbstractAnimal animal : animals){
            animalCall(animal);
        }
    }
//    부모는 자식을 담을 수 있기 때문에 AbstractAnimal이 들어온다.
    static void animalCall(AbstractAnimal animal){
        animal.eat();
        animal.sound();


//          일시적으로 duck을 캐스팅함(?)
        if(animal instanceof Duck) ((Duck) animal).fly();
//            Duck duck = (Duck) animal;
//            duck.fly();
////          ((Duck) animal).fly();

    }
}
