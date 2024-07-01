package afternoon.lang.immutable;
// 불변 객체 - 원시형과 참조형의 차이
public class User {
    private String name;


    public User(String name){
        this.name = name;
    }

//    getter : 사용이유 -> 캡슐화
    public String getName() {
        return name;
    }
//    setter : 사용이유 -> 캡슐화
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }




}
