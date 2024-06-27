package afternoon.memory;

public class Counter {
//    static을 붙이게 되면 노란줄이 쳐진다 counter은 클래스에 붙게 되어 this.를 붙이지 않돌고 한다.
//    해당 클래스에 고정, ... 2가지 더 있음.
    public static int counter = 0;

//    클래스가 인스턴스화 되면 counter가 1씩 증가하게 된다. 하지만 되지 않지~
    Counter(){
        counter++;
    }
}
