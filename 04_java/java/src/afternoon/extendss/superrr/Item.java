package afternoon.extendss.superrr;

public class Item {

    private String name;
    private int price;

    // 자식에게서 값을 받아서 저장하는 곳.
    Item(String name , int price){
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("아이템의 이름은 : " + this.name ) ;
        System.out.println("아이템의 가격은 : " + this.price );
    }

}
