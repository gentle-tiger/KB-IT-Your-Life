package afternoon.poly3.overriding;

public class OverridingMAin {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent value = " + parent.value); // child 출력
        parent.method(); // parent method 출력


        Child child = new Child();
        System.out.println("Child value = " + child.value); // child 출력
        child.method(); // child method 출력


//        중요. value와 method() 가 다른 출력을 보임. Overriding 된 친구를 찾아간다. (다형성)
        Parent poly = new Child();
        System.out.println("Poly value = " + poly.value); // parent 출력
        poly.method(); // Child method 출력
        }
}
