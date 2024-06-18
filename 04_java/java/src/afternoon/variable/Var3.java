package afternoon.variable;

public class Var3 {
    public static void main(String[] args) {
        double a = 0.7;
        int b = (int) a; // 명시적 형변환
        System.out.println(b); // 0

        int c = 3;
        int d = 2;
//        double div = c/d;
        double div = (double) c /d;
        System.out.println(div); // 1.0

    }
}
