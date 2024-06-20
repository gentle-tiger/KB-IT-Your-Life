package afternoon.pack.a;

public class Boss {
    String name;
    int age;

    //  %d : int ,short, long
    //  %s : String
    public Boss() {}

    public Boss(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void printBoss(){
        // 이걸 안 해도 값이 들어오는데 어떻게 출력되는거지?
        System.out.printf("사장이 전달합니다. \n"  +
                           "사장의 이름 : %s \n"  +
                            "사장의 나이 : %d\n"   , name, age );
    }

}
