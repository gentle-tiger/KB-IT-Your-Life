package afternoon.poly3.casting1;

public class CastingMain1 {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent1 = child; // up casting
        Parent parent2 = (Parent) child; // up casting 위와 동일.
    }
}
