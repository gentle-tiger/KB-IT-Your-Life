//import java.util.Scanner;
//
//public class VariableInitializationExample {
//    public static void main(String[] args) {
////변수 value 선언
////        int value;
//        //연산 결과를 변수 result의 초기값으로 대입
//        //        int result = value + 10; //에러
//        //변수 result 값을 읽고 콘솔에 출력
//        //        System.out.println(result); //에러
//
//// VariableUseExample
////        int hour = 3;
////        int minute = 5;
////        System.out.println(hour + "시간 " + minute + "분");
////        int totalMinute = (hour * 60) + minute;
////        System.out.println("총 " + totalMinute + "분");
//
//
//// VariableExchangeExample
////        int x = 3;
////        int y = 5;
////        System.out.println("x:" + x + ", y:" + y);
////        int temp = x;
////        x = y;
////        y = temp;
////        System.out.println("x:" + x + ", y:" + y);
//
//// IntegerLiteralExample
////        int var1 = 0b1011; //2진수
////        int var2 = 0206; //8진수
////        int var3 = 365; //10진수
////        int var4 = 0xB3; //16진수
////        System.out.println("var1: " + var1);
////        System.out.println("var2: " + var2);
////        System.out.println("var3: " + var3);
////        System.out.println("var4: " + var4);
//
//
//// ByteExample
//        byte var5 = -128;
//        byte var6 = -30;
//        byte var7 = 0;
//        byte var8 = 30;
//        byte var9 = 127;
//        //byte var6 = 128; //컴파일 에러(Type mismatch: cannot convert from int byte)
//        System.out.println(var5);
//        System.out.println(var6);
//        System.out.println(var7);
//        System.out.println(var8);
//        System.out.println(var9);
//
//// LongExample
////        long var1 = 10;
////        long var2 = 20L;
////long var3 = 1000000000000; //컴파일러는 int로 간주하기 때문에 에러 발생
////        long var4 = 1000000000000L;
////        System.out.println(var1);
////        System.out.println(var2);
////        System.out.println(var4);
//
////CharExample
//
//        char c1 = 'A'; //문자 저장
//        char c2 = 65; //유니코드 직접 저장
//        char c3 = '가'; //문자 저장
//        char c4 = 44032; //유니코드 직접 저장
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//// FloatDoubleExample
////정밀도 확인
//        float var1 = 0.1234567890123456789f;
//        double var2 = 0.1234567890123456789;
//        System.out.println("var1: " + var1);
//        System.out.println("var2: " + var2);
////10의 거듭제곱 리터럴
//        double var3 = 3e6;
//        float var4 = 3e6F;
//        double var5 = 2e-3;
//        System.out.println("var3: " + var3);
//        System.out.println("var4: " + var4);
//        System.out.println("var5: " + var5);
//
//// BooleanExample
//        boolean stop = true;
//        if(stop) {
//            System.out.println("중지합니다.");
//        } else {
//            System.out.println("시작합니다.");
//        }
//        int x = 10;
//        boolean result1 = (x == 20); //변수 x의 값이 20인가?
//        boolean result2 = (x != 20); //변수 x의 값이 20이 아닌가?
//        System.out.println("result1: " + result1);
//        System.out.println("result2: " + result2);
//
//
//// StringExample
//        // 문자열 변수 선언 및 출력
//        String name = "홍길동";
//        String job = "프로그래머";
//        System.out.println(name);
//        System.out.println(job);
//
//        // 여러 줄 문자열을 이스케이프 문자를 사용하여 선언 및 출력
//        String str = "나는\n\"자바\"\n를 배웁니다.";
//        System.out.println(str);
//
//        str = "번호\t이름\t직업";
//        System.out.println(str);
//
//        // 여러 줄 문자열을 이스케이프 문자를 사용하여 출력
//        System.out.print("나는\n");
//        System.out.print("자바를\n");
//        System.out.print("배웁니다.");
//
//
//// TextBlockExample
//
//        String str1 = "" +
//                "{\n" +
//                "\t\"id\":\"winter\",\n" +
//                "\t\"name\":\"눈송이\"\n" +
//                "}";
//        String str2 = """
//                {
//                "id":"winter",
//                "name":"눈송이"
//                }
//                """;
//        System.out.println(str1);
//        System.out.println("------------------------------------");
//        System.out.println(str2);
//        System.out.println("------------------------------------");
//
//        String str = """
//                나는 자바를 \
//                학습합니다.
//                나는 자바 고수가 될 겁니다.
//                """;
//        System.out.println(str);
//
//// PromotionExample
//        byte byteValue = 10;
//        int intValue = byteValue
//                ;
//        System.out.println("intValue: " + intValue);
//        char charValue = '가';
//        intValue = charValue
//        ;
//        System.out.println("가의 유니코드: " + intValue);
//        intValue = 50;
//        long longValue = intValue
//                ;
//        System.out.println("longValue: " + longValue);
//        longValue = 100;
//        float floatValue = longValue
//                ;
//        System.out.println("floatValue: " + floatValue);
//        floatValue = 100.5F;
//        double doubleValue = floatValue
//                ;
//        System.out.println("doubleValue: " + doubleValue);
//
//
//// CastingExample
//        int var1 = 10;
//        byte var2 = (byte) var1;
//        System.out.println(var2); //강제 타입 변환 후에 10이 그대로 유지
//        long var3 = 300;
//        int var4 = (int) var3;
//        System.out.println(var4); //강제 타입 변환 후에 300이 그대로 유지
//        int var5 = 65;
//        char var6 = (char) var5;
//        System.out.println(var6); //'A'가 출력
//        double var7 = 3.14;
//        int var8 = (int) var7;
//        System.out.println(var8); //3이 출력
//
//// OperationPromotionExample
//        byte result1 = 10 + 20; //컴파일 단계에서 연산
//        System.out.println("result1: " + result1);
//        byte v1 = 10;
//        byte v2 = 20;
//        int result2 = v1 + v2; //int 타입으로 변환 후 연산
//        System.out.println("result2: " + result2);
//        byte v3 = 10;
//        int v4 = 100;
//        long v5 = 1000L;
//        long result3 = v3 + v4 + v5; //long 타입으로 변환 후 연산
//        System.out.println("result3: " + result3);
//        char v6 = 'A';
//        char v7 = 1;
//        int result4 = v6 + v7; //int 타입으로 변환 후 연산
//        System.out.println("result4: " + result4);
//        System.out.println("result4: " + (char)result4);
//
//// OperationPromotionExample
//        int v8 = 10;
//        int result5 = v8 / 4; //정수 연산의 결과는 정수
//        System.out.println("result5: " + result5);
//        int v9 = 10;
//        double result6 = v9 / 4.0; //double 타입으로 변환 후 연산
//        System.out.println("result6: " + result6);
//        int v10 = 1;
//        int v11 = 2;
//        double result7 = (double) v10 / v11; //double 타입으로 변환 후 연산
//        System.out.println("result7: " + result7);
//
//// StringConcatExample
////숫자 연산
//        int result1 = 10 + 2 + 8;
//        System.out.println("result1: " + result1);
////결합 연산
//        String result2 = 10 + 2 + "8";
//        System.out.println("result2: " + result2);
//        String result3 = 10 + "2" + 8;
//        System.out.println("result3: " + result3);
//        String result4 = "10" + 2 + 8;
//        System.out.println("result4: " + result4);
//        String result5 = "10" + (2 + 8);
//        System.out.println("result5: " + result5);
//
//// PrimitiveAndStringConversionExample
//        int value1 = Integer.parseInt("10");
//        double value2 = Double.parseDouble("3.14");
//        boolean value3 = Boolean.parseBoolean("true");
//        System.out.println("value1: " + value1);
//        System.out.println("value2: " + value2);
//        System.out.println("value3: " + value3);
//        String str1 = String.valueOf(10);
//        String str2 = String.valueOf(3.14);
//        String str3 = String.valueOf(true);
//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);
//        System.out.println("str3: " + str3);
//
//// VariableScopeExample
//        int v1 = 15;
//        if(v1>10) {
//            int v2 = v1 - 10;
//        }
//        int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
//
//
//// PrintfExample
//        int value = 123;
//        System.out.printf("상품의 가격:%d원\n", value);
//        System.out.printf("상품의 가격:%6d원\n", value);
//        System.out.printf("상품의 가격:%-6d원\n", value);
//        System.out.printf("상품의 가격:%06d원\n", value);
//        double area = 3.14159 * 10 * 10;
//        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
//        String name = "홍길동";
//        String job = "도적";
//        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
//
//// ScannerExample
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("x 값 입력: ");
//        String strX = scanner.nextLine();
//        int x = Integer.parseInt(strX);
//        System.out.print("y 값 입력: ");
//        String strY = scanner.nextLine();
//        int y = Integer.parseInt(strY);
//        int result = x + y;
//        System.out.println("x + y: " + result);
//        System.out.println();
//
//        while(true) {
//            System.out.print("입력 문자열: ");
//            String data = scanner.nextLine();
//            if(data.equals("q")) {
//                break;
//            }
//            System.out.println("출력 문자열: " + data);
//            System.out.println();
//        }
//        System.out.println("종료");
//
//    }
//
//}
