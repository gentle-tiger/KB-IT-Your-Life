package afternoon.poly3.casting1;

import afternoon.extendss.superrr.GrandChild;

public class CastingMain2 {
    public static void main(String[] args) {
//       강사님 강의 : 80p 캐스팅
        // # 1번 코드 (정상 작동)
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        
        // # 2번 코드 (에러 발생)
        Parent parent2 = new Parent();
        Child child2 =(Child) parent2;

//        Parent parent = new Child(); // upcasting (정상)
//        Child child = new Child(); // (정상)
//        GrandChild grandChild = (GrandChild) new Child(); // class exception 에러 발생

    }
}
