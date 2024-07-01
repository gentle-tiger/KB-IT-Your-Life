package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

//      자식 클래스에서 부모 클래스 메서드를 사용할 수 있다.
//      Obeject > Parent > Child
//      child.toString() 메서드는 Obeject 메서드이며, 부모 클래스는 묵시적으로 Object 클래스를 상속받는다.  extends Object
        child.childMethod();
        child.parentMethod();

//      두 코드가 동일한 결과를 보여준다. 자바에서 자체적으로 자동실행.
//        afternoon.lang.object.Child <- 패키지명
//        println은 인스턴에 들어가 찾아서 출력한다(?)
//        @2f4d3709 <- 메모리주소
        System.out.println(child.toString());
        System.out.println(child);

//      alt + insert
//      10진수의 값으로 주소값이 나온다.
        String ref1 = Integer.toHexString(child.hashCode());
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 : " + ref1);
        System.out.println("ref2 : " + ref2);


//        Parent와 Child를 하나의 배열에 담을 수 있나요?
//        -> 다형적 관점에서 Parent 가 상속했기 때문에 담을 수 있다.
        Parent[] objects = {new Parent(), new Child()};
        Object[] object2 = {new Parent(), new Child(), new OtherClass()};


        System.out.println(size(object2));
    }

    //    public static int size(Object[] objects){
//
//        int size = 0;
//        for(Object object  : objects){
//            size++;
//        }
//        return size;
//    }
    public static int size(Object[] objects) {
        return objects.length;
    }


}
