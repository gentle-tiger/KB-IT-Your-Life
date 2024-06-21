package afternoon.extendss.superrr;

public class Book extends Item{
    private String author;
    private String title;

//  super 가 호출되어 있는 상태인데 매개변수를 넣지 않았기 떄문에 에러가 뜨는 것임.

    Book(String name, int price , String author, String title){

        // Book를 인스턴스해서 누군가 값을 넣으면 해당 값이 여기로 들어온다.
        super(name, price);


        this.author = author;
        this.title = title;

    }

    @Override
    public void print(){
        // 부모가 name, price를 print에 담아서 메서드를 가져온다.
        super.print();
        System.out.println("책의 저자는 : "+ this.author );
        System.out.println("책의 제목은 : "+ this.title );
    }

}
