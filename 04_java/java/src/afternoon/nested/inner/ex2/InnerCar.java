package afternoon.nested.inner.ex2;

// 내부 클래스 
public class InnerCar {
    private String model;
    private int oilAmount;
    private Engine engine;

    public InnerCar(String model, int oilAmount) {
        this.model = model;
        this.oilAmount = oilAmount;
        this.engine = new Engine();  // 나를 던져준다. (내부 클래스이기 떄문에 this를 넣지 않아도 된다.)
    }

    public String getModel(){
        return model;
    }

    public int getOilAmount(){
        return oilAmount;
    }

    public void start(){
        engine.start();
        System.out.println(model + "의 주행을 시작합니다.");
    }
    // ex1 폴더에서는 클래스를 나누어 구현했다.
    // engine은 항상 car 클래스가 필요하기 때문에 내부에 클래스를 둠으로 가독성 좋게 구현할 수 있다?????
    private class Engine {

        // 메서드
        public void start(){
            System.out.println("자동차 주유 상태 확인 : " + oilAmount);  // 어떻게 가져오는지 알아??
            if(oilAmount > 0){
                System.out.println(model +"의 엔진을 구동합니다.");
            }
        }
    }




}
