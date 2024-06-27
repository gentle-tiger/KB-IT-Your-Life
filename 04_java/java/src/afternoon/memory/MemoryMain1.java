package afternoon.memory;

public class MemoryMain1 {
    public static void main(String[] args) {


//  stack은 실행 순서가 중요하다
        System.out.println("메인 메서드 시작 ");
        method1();
        System.out.println("메인 메서드 종료 ");
    }

    static void method1(){
        System.out.println("메서드 1 수행 시작");
        Date data1 = new Date(10);
        method2(data1);
        System.out.println("메서드 1 수행 종료");
    }

    static void method2(Date data){
        System.out.println("메서드 2 수행 시작");
        System.out.println("매개변수 data의 value 값은 : "+ data.getValue());
        System.out.println("메서드 2 수행 종료");

    }



}
