package afternoon.generic.ex2;

public class StrictGenericBox<T> {
    private T value;

    private String successMsg = "전달 받은 값이 %s 이 맞습니다. 값을 저장합니다.";
    private String failMsg = "전달 받은 값이 %s 이 아닙니다.";
    public T getValue() {
        return value;
    }

    public void setValue(T value) {

        if(value instanceof String || value instanceof  Integer || value instanceof Long){
            System.out.printf(successMsg , value);
            this.value = value;// 맞을 때만 value 의 값을 변환한다.
        }else {
            System.out.printf(failMsg , value);
        }
    }
}
