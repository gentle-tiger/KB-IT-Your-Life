package afternoon.exception.basic;

//  try catch 를 사용하지 않고 에러 피하기.
//  다만 예외를 알 수 없게 된다.
public class ExceptionWithout2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // accessArr() 메서드를 통해 접근이 되는지 확인한다.
        if(accessArr(arr, 5)){
            System.out.println("배열 접근 가능");

            Object obj = null; // 클래스를 넣었다고 생각하고 인스턴스화 되었는지 확인하는 코드

            if(!accessNull(obj)){
                System.out.println("객체가 null이 아닙니다.");
                System.out.println("원하던 작업을 이어갑니다. ");
            }else{
                System.out.println("객체가 비었습니다. 에러를 발생시킵니다.");
            }
        }else{
            System.out.println("배열 접근 불가능");
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
