package afternoon.extendss.access.child;

import afternoon.extendss.access.parent.Parent;

// 상속 받는 클래스
public class Child extends Parent {

    public void access(){
        System.out.println("publicMethod : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedMethod : " + protectedValue) ; // 패키지는 다르지만, 상속관게라 가능
//        System.out.println("defaultValue : " + defaultValue); // 패키지가 달라서 불가능
//        System.out.println("privateValue : " + privateValue ); // 같은 클래스가 아니므로 불가능

        publicMethod();
        protectedMethod();
//    defaultMethod();
//    privateMethod();
        printParent();
    }


}
