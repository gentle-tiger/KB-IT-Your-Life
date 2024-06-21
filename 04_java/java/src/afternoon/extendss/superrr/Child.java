package afternoon.extendss.superrr;

public class Child extends Parent{

    // 생성자에 매개변수를 받아보자 / 부모에 접근하는 코드가 생략되어 있는 것임.
    public Child(String name){
        super(); // Parent() -> 생성자; 생략가능 .
        System.out.println("Child 생성자");
    }

    public Child(String name , int age){
        super(); // 생략된 부모의 기본 생성자
        System.out.println("Child 생성자 2 !! ");
    }
}
