package afternoon.extendss.superr;

public class Child extends Parent {


    public String name ="자식 클래스";

    @Override
    public void hello(){
        System.out.println("hello~ 자식 클래스에서 왔당~");
    }

    public void superCall(){
        System.out.println("내가 있는 곳은 : "+ this.name);
//      인스턴스가 생성될 때 부모도 같이 데려온다. 이때 super는 부모를 가리킨다.
        System.out.println("부모가 있는 곳은 : "+super.name);

        this.hello(); // this. 안 써도 됨. 잠시 구분하기 위해 사용.
        super.hello();
    }


}
