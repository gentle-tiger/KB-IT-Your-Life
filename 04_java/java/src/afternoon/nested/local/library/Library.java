package afternoon.nested.local.library;
// 도서를 저장하고 도서 목록을 출력하는 프로그램 작송
public class Library {
    // 멤버변수
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;

    // 생성자
    public Library(){
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }
    // 메서드
    // "제목과 저자를 받음"
    public void addBook(){

        if(books.length != LIBRARY_SIZE){

            System.out.println("보관된 책의 수는 : "+ books[books.length-1]);
            System.out.println("제목 : "+1 + "저자 : "+ 2);
        }else{
            System.out.println("더이상 책을 보관할 수 없습니다.");
        }

    }
    public void showBooks(){}

    // 중첩 클래스
    public class Book{
        // 멤버 변수
        String title;
        String author;

        // 생성자
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }


    }

}

