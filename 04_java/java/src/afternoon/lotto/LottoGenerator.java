package afternoon.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {

//  필드 데이터
    private int lottoNumberSize = 6;
    private int[] lottoNumbers = new int[lottoNumberSize];

//   기본 생성자
    public LottoGenerator(){}

//    메서드 선언
    public void generate(){
            for(int i = 0; i < lottoNumberSize; i++){
                Random rand = new Random();
                int number = rand.nextInt(45) + 1;

                if(equalsNumber(number)){
                    lottoNumbers[i] = number;
                }else{
                    i--;
                }
            }
    }
    private boolean equalsNumber(int number){
        for(int lottoNumber : lottoNumbers) {
            if (number == lottoNumber)
                return false;
        }
        return true;
    }

    public void printLottoNumbers(){
        System.out.print("로또 번호 : ");
        Arrays.sort(lottoNumbers);
        for(int lottoNumber : lottoNumbers){
            System.out.print(lottoNumber);
            System.out.print(" ");
        }
    }
}
