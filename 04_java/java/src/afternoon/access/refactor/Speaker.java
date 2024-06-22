package afternoon.access.refactor;

public class Speaker {
    private int volumne;

    // 볼륨 조정값
    private int volumneAdjust = 1;

    // 볼륨 최댓값, 최솟값
    private int maxVolumne = 100;
    private int minVolumne = 0;

    // 볼륨 비교 시 출력 텍스트
    private String volumneUpEqualsText= "더이상 볼륨 조절이 불가능합니다.";
    private String volumneDownEqualsText = "스피커가 Mute 되었습니다. ";

    // 기본 생성자
    public Speaker(){
        this.volumne = 20;
    }


//    Speaker sp = new Speaker();
//    // .부분 생성자
//    public Speaker(int volume){
//            this.volumne = volume;
//    }
//    Speaker sp1 = new Speaker(30);
//
//    public Speaker(int volume, String name){
//        this.volumne = volume;
//        this.name = name;
//    }
//    Speaker sp2 = new Speaker(20,"호진이형");
//
//    public Speaker(String name){
//        this.name = name;
//    }
//    Speaker sp3 = new Speaker("호진이형");


    // 볼륨 증가
    public void volumneUp(){
      if(volumneUpEquals()){
          this.volumne += this.volumneAdjust;
      }else{
          System.out.println(volumneUpEqualsText);
      }
    }

    // 볼륨 감소
    public void volumneDown(){
        if(volumneDownEquals()){
            this.volumne -= this.volumneAdjust;
        }else{
            System.out.println(volumneDownEqualsText);
        }
    }
    // 볼륨 0
    public void volumneMute (){
        this.volumne = this.minVolumne;
    }

    // 볼륨 비교
    // 99 or 1 일 때 +1, -1을 한 후 함수를 빠져나온다.
    private boolean volumneUpEquals(){
        return volumne < this.maxVolumne;
    }
    private boolean volumneDownEquals(){
        return volumne > this.minVolumne;
    }


}
