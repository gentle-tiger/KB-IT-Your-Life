package afternoon.variable.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요\n");
        System.out.print("문자열을 입력하세요");

        // 문자로 받기
        String str = scanner.nextLine();
        System.out.println("입력한 문자열은!? :"+ str);
        System.out.println("");

        System.out.println("정수를 입력하세요 : ");
        int number =scanner.nextInt();
        System.out.println("입력한 정수는 : " + number);


        System.out.println("실수를 입력하세요 : ");
        double number2 =scanner.nextDouble();
        System.out.println("입력한 정수는 : "+ number2);


    }
}
