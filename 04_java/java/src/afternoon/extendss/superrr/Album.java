package afternoon.extendss.superrr;

public class Album extends Item {

    private String artist;

//  album 을 인스턴스하는 자식 클래스에서 값을 전달받아 저장한다.
//    생성자를 인스턴스 하는 클래스는 자식 클래스??
    public Album(String name, int price , String artist) {
//      전달받은 name, price는 부모 클래스로 전달된다.
        super(name, price);
//      artist는 현재 Album 클래스에 저장된다.
        this.artist = artist;

    }

//   부모에게서 받은 print 메서드에 방금 보낸 name, price를 담아와서 가져온다.
    @Override
    public void print(){
        super.print();
//      저장된 artist의 값을 담아서 Album 클래스의 print() 메서드를 사용하는 곳에서 전달한다.
        System.out.println("아티스트의 이름은 : "+ this.artist );
    }


}
