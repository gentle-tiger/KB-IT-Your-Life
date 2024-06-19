package afternoon.classs;

public class Customer {

    // 필드 정의
    String name  ;
    int age ;
    int total ;
    boolean isBlackList ;

    // 기본 생성자
    // 기본 생성자에서 this는 필드를 가리킨다?
    Customer(){
        this.name ="아직 몰라요";
        this.age = 0;
        this.total = 0;
        this.isBlackList =  false;
    }

    // 부분 생성자
    Customer(String name, int age, int total, boolean isBlackList){
        this.name = name;
//        this.age = age;   // 사실 기본 원시 데이터가 들어가기 때문에 명시하지 않아도 됨.
//        this.total = total;
//        this.isBlackList= isBlackList;
    }


    void printCustomer (){
        System.out.printf("고객의 성함은? %s\n" ,this.name);
        System.out.printf("고객의 나이는? %s\n" , this.age);
        System.out.printf("고객의 총 사용한 금액은? %s\n" ,this.total);
        System.out.printf("고객의 블랙리스트 여부는 %s\n" , this.isBlackList);
    }
}
