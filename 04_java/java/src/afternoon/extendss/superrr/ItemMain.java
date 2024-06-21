package afternoon.extendss.superrr;

public class ItemMain {
    public static void main(String[] args) {

//      book 클래스로 해당 값이 전달된다.
        Book book = new Book("나쁜책", 10000, "익명의 기자", "JSP");
//      album 클래스로 해당 값이 전달된다.
        Album album = new Album("모순", 12000, "안진진");

        book.print();
        album.print();



    }




}
