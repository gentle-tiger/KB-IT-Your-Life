package afternoon.exception.basic.ex1;


// NullPointerException 에러 처리
// finally 를 통한 코드 실행
// funally 의 코드가 먼저 실행되고 이후에 다음 코드가 실행된다.
public class ExceptionFinally {
    public static void main(String[] args) {

        try {
            Object obj = null;
            obj.equals(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }finally{
            System.out.println("정말 실행하고 싶은 코드");
        }
        System.out.println("나오나요");

    }
}
