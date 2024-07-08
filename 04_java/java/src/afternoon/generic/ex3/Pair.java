package afternoon.generic.ex3;

public class Pair<T, K> {
    // 매개변수
    private T value;
    private K key;

    // 생성자
    public Pair(T value, K key) {
        this.key = key;
        this.value = value;
    }




    @Override
    public String toString() {
        return "Pair[ " +
                "key = " + key +
                "  |  value = " + value +
                " ]";
    }




}
