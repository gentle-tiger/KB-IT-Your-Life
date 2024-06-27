package afternoon.poly4.ex1;

import afternoon.poly4.Human;

public class AnimalMain {
    public static void main(String[] args) {

//    Animal[] animals = new Animal[3];
    Animal[] animals = {new Dog(), new Cat(), new Duck()};


    for (Animal animal : animals) {

            animalDo(animal);

// fly 인터페이스를 구현한 인스턴스인지 확인하는 것. Duck이 들어오면 안 됨.
        if(animal instanceof Fly){
//          ((Fly) animal).fly(); 바로 실행하는 것
            flyDo((Fly) animal);
        }
    }

    }

    public static void animalDo(Animal animal){
        animal.eat();
        animal.sound();
    }


    public static void flyDo(Fly fly){
        fly.fly();
    }


}
