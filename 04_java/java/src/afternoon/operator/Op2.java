package afternoon.operator;

public class Op2 {
    public static void main(String[] args) {

        // 문자열 비교
        String str1 = "abc";
        String str2 = "ref";
        String str3 = "abc";


        // 비교하려는 문자열을 함수 안에 넣는다.
        boolean result1 = str1.equals(str2);
        boolean result2 = !str1.equals(str2);
        boolean result3 = "abc".equals(str2);
        boolean result4 = str1.equals("def");

        // 전부 false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        // 문자 비교의 특이점

        System.out.println("abc" == "abc"); // true
        System.out.println("abc" == "def"); // false
        System.out.println("abc" == new String("abc")); // false , new 는 새로운 메모리를 생성한다.

        int score = 90;
        boolean  result = score >= 80 && score <= 100;
        System.out.println(result); // true

    }
}
