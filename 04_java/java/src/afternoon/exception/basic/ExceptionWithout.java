package afternoon.exception.basic;

//  try catch 를 사용하지 않고 에러 피하기.
//  다만 예외를 알 수 없게 된다.
public class ExceptionWithout {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int idx = arr.length;

            if(idx < arr.length){
                System.out.println("arr[idx] : "+ arr[idx]);
            }else{
                System.out.println("나오나요?");
            }



    }
}
