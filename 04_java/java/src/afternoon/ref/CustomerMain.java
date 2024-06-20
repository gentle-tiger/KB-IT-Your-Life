package afternoon.ref;

public class CustomerMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.name = "최호진";
                                        // 근데 왜 customerMAin 은 왜  안 나오지?
        System.out.println(customer1);  // afternoon.ref.Customer@b4c966a

        // 인스턴스화를 안 하고 변수만 만들어 null을 부여하기.
        Customer customer2 = null;
//        System.out.println(customer2); // null
        System.out.println(customer2.name); //

        // null 값인 customer2에게 customer1을 주었다.
        customer2 = customer1;

//        // customer1과 customer2 가 동일한 메모리 주소를 사용하는 것을 알 수 있다.
//        System.out.println(customer2);  // afternoon.ref.Customer@b4c966a
//        System.out.println(customer2.name);  // 최호진 (customer1과 메모리 주소 동일)





    }
}
