package afternoon.poly3.Instance;

public class InstanceMain2 {
    public static void main(String[] args) {

    Parent[] parents = {new Parent(), new Child(), new GrandChild()};


    for(Parent p : parents){
        testIntanceOf(p);
    }

    }
//   Parent 를 p라는 이름으로 받는다???
    public static void testIntanceOf(Parent p ){
        // 모든 클래스에 parentMethod가 있을까? yes 상속 받았기 때문에 모든 클래스에 parentMethod 가 존재한다.
        p.parentMethod();
        if(p instanceof Child){ // 일종의 타입 가드
            System.out.println("매개 변수로 들어온 인스턴스가 Child 클래스의 인스턴스가 맞음");
            ((Child) p).childMethod(); // down casting /가지고는 있었지만 벽에 막혀있었음
        }

        if(p instanceof GrandChild){
            System.out.println("매개 변수로 들어온 인스턴스가 GrandChild 클래스의 인스턴스가 맞음");
            ((GrandChild) p).grandChildMethod(); // down casting /가지고는 있었지만 벽에 막혀있었음
//            GrandChild grandChild = (GrandChild) p;
//            grandChild.grandChildMethod();

        }



    }





}
