package afternoon.generic.limit;

public class World2 {
    public static void main(String[] args) {

        GenericWorld<Integer> integerWorld = new GenericWorld<>();
        integerWorld.setNumber(10);
        integerWorld.transDouble(); // T를 Number로 지정했기 때문에 문제가 생기지 않음.
        System.out.println(integerWorld.getNumber());

//        GenericWorld<String>  Number로 정했기 때문에 String으로 할 경우 에러가 뜬다.

        GenericWorld<Long> LongWorld = new GenericWorld<>();
        LongWorld.setNumber(20L);
        System.out.println(LongWorld.getNumber());
    }
}
