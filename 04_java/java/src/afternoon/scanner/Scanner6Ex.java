package afternoon.scanner;


import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 랜덤한 수 만들기
        int randomNum = (int) (Math.random() * 100);
        System.out.println(randomNum);

    while (true) {
        System.out.println("랜덤한 숫자를 입력하세요 :");
        int X = sc.nextInt();

        if(randomNum == X){
            System.out.println("정답입니다! 랜덤 숫자는" + X);
            return;
        } else if (randomNum > X) {
            System.out.println("UP");

        }else {
            System.out.println("DOWN");

        }
    }
    }
}
