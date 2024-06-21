package afternoon.extendss;

public class CarMain {
    public static void main(String[] args) {

//      static 에 무언가를 만든다.

        GasCar gascar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        gascar.fillUp();
        gascar.move();
        gascar.openDoor();

        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();

        hydrogenCar.fillHydrogen();

    }
}
