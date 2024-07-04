package afternoon.exception.basic;


// 예외가 발생하고 try catch롤 찾았다
public class ExceptionCatch {
    public static void main(String[] args) {

        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        }catch(Exception e){
            e.printStackTrace(); // 어디서부터 출발했는지 스택을 통해 찾아준다.
        }

        // 예외가 발생하더라도 프로그램이 죽지 않고 다음 코드가 실행된다.
        System.out.println("나오나요?");

    }
}
