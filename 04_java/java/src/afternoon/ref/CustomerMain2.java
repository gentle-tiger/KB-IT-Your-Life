package afternoon.ref;

public class CustomerMain2 {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();  // customer2의 new Customer()가 회색인 것을 알 수 있음.

        customer2 = customer1;

        System.out.println(customer1);
        System.out.println(customer2);







    }
}
