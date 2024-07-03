package afternoon.nested.local.ex1;

import java.util.Random;

public class Ex3Main {
    public static void complicatedProgram(Dice dice){
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종로 후, 원하는 기능 실행");

        // 코드 조각 시작
        // 여기서 원하는 프로그램 실행
        dice.run();
        // 코드 조각 종료

        System.out.println("복잡한 과정 다시 시작");
        System.out.println("복잡한 과정 종로 후, 프로그램 종류");
    }

    public static void main(String[] args) {
        // static 을 제외하여 내부 클래스
        // 캡슐화가 깨지므로 static을 사용하여 접근을 막는 것을 추천하는 것이다.
        class DiceOnce implements Dice{
            @Override
            public void run(){
                // 코드 덩어리 시작
                int rand = new Random().nextInt(6) + 1;

                System.out.println("주사위 값은 : " + rand);
                // 코드 덩어리 종료
            }
        }

        class DiceSum implements Dice{
            @Override
            public void run (){
                int rand1 = new Random().nextInt(6) + 1;
                int rand2 = new Random().nextInt(6) + 1;
                int sum = rand1 + rand2;
                System.out.println("주사위 값은 : " + sum);
            }
        }
        // 인스턴스 상태로 전달한다.
        complicatedProgram(new DiceOnce());
        complicatedProgram(new DiceSum());
    }
}
