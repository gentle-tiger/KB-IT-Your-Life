package afternoon.variable.operator;

public class Op1 {
    public static void main(String[] args) {
        int a= 3;
        int b =2;
        System.out.println(a / b);
        // 문자 연산의 특이점
        String str1 = "a + B = ";
        int c = 10;
        System.out.println(str1 + c); // string이랑 더하면 int는 문자가 된다.

    // 문자 연산의 특이점 2
        int d= 10;
        char e= 'e';
        System.out.println(d + e); // char를 number로 자동 변환함.
    }
}

