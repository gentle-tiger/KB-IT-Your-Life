package afternoon.poly2;

public class AnimalMain2 {
    public static void main(String[] args) {
//
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};

        for(Animal animal : animals){
            soundAnimal(animal);
        }
    }
//     부모 클래스는 자식을 감쌀 수 있다.
    private static void soundAnimal(Animal animal){
        animal.sound();
    }


}
