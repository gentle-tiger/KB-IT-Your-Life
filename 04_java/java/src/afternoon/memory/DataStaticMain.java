package afternoon.memory;
// static이 붙어 있기 때문에 main이 바로 실행되는 것이다.
// static이 붙으면 힙에 보관되지 않고 메서드 영역에 보관된다.
// 메서드 영역에서 보관하여 모든 인스턴스가 접근 가능하도록 한다.
public class DataStaticMain {
    public static void main(String[] args) {


        System.out.println(DataStatic.value);
        DataStatic.showValue();




    }
}
