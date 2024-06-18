package afternoon.variable.scanner;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("시작 정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.print("종료 정수를 입력하세요 : ");
        int y = sc.nextInt();

        if(x < y){
            int num = 0;
            for (int i = 0; i < y; i++){
                num += x;
                x++;
            }
            System.out.println("시작 수부터 종료 수까지의 합은 : " + num);
        }else{
            System.out.println("시작 정수가 종류 정수보다 큽니다!");
        }

    }
}
