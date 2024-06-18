//public class Operator {
//    public static void main(String[] args) {
//
//// SignOperatorExample
//        int x = -100;
//        x = -x;
//        System.out.println("x: " + x);
//        byte b = 100;
//        int y = -b;
//        System.out.println("y: " + y);
//
//// IncreaseDecreaseOperatorExample
//        int x = 10;
//        int y = 10;
//        int z;
//        x++;
//        ++x;
//        System.out.println("x=" + x);
//        System.out.println("-----------------------");
//        y--;
//        --y;
//        System.out.println("y=" + y);
//        System.out.println("-----------------------");
//        z = x++;
//        System.out.println("z=" + z);
//        System.out.println("x=" + x);
//        System.out.println("-----------------------");
//        z = ++x;
//        System.out.println("z=" + z);
//        System.out.println("x=" + x);
//        System.out.println("-----------------------");
//        z = ++x + y++;
//        System.out.println("z=" + z);
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//
//// ArithmeticOperatorExample
//        byte v1 = 10;
//        byte v2 = 4;
//        int v3 = 5;
//        long v4 = 10L;
//        int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동 변환 후 연산
//        System.out.println("result1: " + result1);
//        long result2 = v1 + v2 - v4; //모든 피연산자는 long 타입으로 자동 변환 후 연산
//        System.out.println("result2: " + result2);
//        double result3 = (double) v1 / v2;//double 타입으로 강제 변환 후 연산
//        System.out.println("result3: " + result3);
//        int result4 = v1 % v2;
//        System.out.println("result4: " + result4);
//
//// OverflowUnderflowExample
//        byte var1 = 125;
//        for (int i = 0; i < 5; i++) { // { }를 5번 반복 실행
//            var1++; // ++ 연산은 var1의 값을 1 증가시킨다.
//            System.out.println("var1: " + var1);
//        }
//
//        System.out.println("-----------------------");
//
//        byte var2 = -125;
//        for (int i = 0; i < 5; i++) { // { }를 5번 반복 실행
//            var2--; // -- 연산은 var2의 값을 1 감소시킨다.
//            System.out.println("var2: " + var2);
//        }
//// AccuracyExample1
//
//        int apple = 1;
//        double pieceUnit = 0.1;
//        int number = 7;
//        double result = apple - number*pieceUnit;
//        System.out.println("사과 1개에서 남은 양: " + result);
//
//// AccuracyExample2
//        int apple = 1;
//        int totalPieces = apple * 10;
//        int number = 7;
//        int result = totalPieces - number;
//        System.out.println("10조각에서 남은 조각: " + result);
//        System.out.println("사과 1개에서 남은 양: " + result/10.0);
//
//// InfinityAndNaNCheckExample
//        int x = 5;
//        double y = 0.0;
//        double z = x / y;
////double z = x % y;
////잘못된 코드
//        System.out.println(z + 2);
////알맞은 코드
//        if(Double.isInfinite(z) || Double.isNaN(z)) {
//            System.out.println("값 산출 불가");
//        } else {
//            System.out.println(z + 2);
//        }
//
//
//
//    }
//}
