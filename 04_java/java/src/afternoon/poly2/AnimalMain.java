package afternoon.poly2;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);


//        donkey.sound();
//        dog.sound();
//        cat.sound();
//        chicken.sound();

    }
//     부모 클래스는 자식을 감쌀 수 있다.
    private static void soundAnimal(Animal animal){
        animal.sound();
    }


}
