import java.util.Scanner;

public class CLIFrameworkV0 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("------------------------------");
            System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------");
            System.out.println("선택 >  ");
        }

        int selectNo = Integer.parseInt(scanner.nextLine());

        if(selectNo == 1){
            System.out.print("학생 수> ");
            studentNum = Integer.parseInt(scanner.nextLine());
            scores = new int[studentNum];
        }else if(selectNo == 2){
            for(int i = 0; i < scores.length; i++) {
                System.out.print("score[" + i + "] >");
                scores[i] = Integer.parseInt(scanner.nextLine());
            }
        }else if (selectNo == 3){
            for(int i = 0; i <scores.length; i++){
                scores[i] = Integer.parseInt(scanner.nextLine());
            }
        }else if(selectNo == 4){
            int max = 0;
            int sum = 0;
            double avg = 0;
            for(int i = 0; i < scores.length; i++){
                //   max와 scores[i] 중 더 큰 값을 max에 저장.
                max = (max < scores[i]) ? scores[i] : max;
                sum =

            }
        }

    }
}
