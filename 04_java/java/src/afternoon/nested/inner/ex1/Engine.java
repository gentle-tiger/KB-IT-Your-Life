package afternoon.nested.inner.ex1;

//
public class Engine {
    // 멤버 변수
    private  Car car;

    // 생성자 (인스턴스 주소값을 넣어주었기 떄문에 Engine은 car의 메모리 주소의 위치를 알게 된다.)
    public Engine(Car car){
        this.car = car;
    }

    // 메서드
    public void start(){
        System.out.println("자동차 주유 상태 확인 : " + car.getOilAmount());  // 어떻게 가져오는지 알아??
        if(car.getOilAmount() > 0){
            System.out.println(car.getModel() +"의 엔진을 구동합니다.");
        }
    }



}
