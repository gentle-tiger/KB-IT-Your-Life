package afternoon.lang.immutable;
// 불변객체 공부
public class ImmutableUser {
//     final은 생성자 또는 초기값을 지정해주어야 함.
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

//    getter만 생성. setter는 x

    public String getName() {
        return name;
    }

//    불변객체에서 값을 변경하는 것은 불가능하기 때문에 새로운 인스턴스를 생성하여 내보낸다.
    public ImmutableUser setName(String name){
        return new ImmutableUser(name);
    }
//  setter을 생성하면 에러가 남. error : cannot assign a value to final variable name
//    public void setName(String name){
//        this.name = name;
//    }


    @Override
    public String toString() {
        return "ImmutableUser{" +
                "name='" + name + '\'' +
                '}';
    }

}
