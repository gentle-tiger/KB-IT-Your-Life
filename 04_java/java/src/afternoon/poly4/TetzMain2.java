package afternoon.poly4;

public class TetzMain2 {
    public static void main(String[] args) {

//    Animal[] animals = {new Dog(), new Tetz()};
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Tetz();

        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);

            if(animals[i] instanceof Human){
                // 타입 에러 -> Human으로 타입을 바꿔주는. 캐스팅
                humanDo((Human) animals[i]);

            }
        }


//        Dog dog = new Dog();
//        Tetz tetz = new Tetz();
//
//        animalDo(dog);
//        animalDo(tetz);
////        humanDo(dog); 에러
//        humanDo(tetz);


    }

    public static void animalDo(Animal animal) {
        System.out.println("동물 기능 테스트");
        animal.eat();
        animal.sleep();
        System.out.println("동물 기능 테스트 종료");
    }

    public static void humanDo(Human human) {
        System.out.println("사람 기능 테스트 ");
        human.think();
        System.out.println("사람 기능 테스트 종료");
    }


}
