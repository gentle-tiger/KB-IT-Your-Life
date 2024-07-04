package afternoon.exception.basic;

//  try 사용하면 예외처리도 되면서 가독성도 좋아진다.
public class ExceptionWith {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3, 4, 5};
            accessArr(arr, 5);
            System.out.println("예외가 발생하지 않았습니다.");
            System.out.println("원하는 작업을 이어갑니다. ");

            Object obj = null;

            accessNull(obj);
            System.out.println("객체가 null이 아닙니다. ");
            System.out.println("원하던 작업을 이어갑니다.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외가 발생하였습니다.");
        }
    }


    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    // 다형성
    // Object는 모든 객체의 부모이다. 범용성을 통해 모든 에러를 처리할 수 있게 된다.
    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }


}
