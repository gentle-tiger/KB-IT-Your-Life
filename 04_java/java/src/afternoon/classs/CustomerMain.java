package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        // import
        Customer customer = new Customer();

        customer.printCustomer();

        System.out.println();

        // import
        Customer customer2 = new Customer("",28,1000,true);
        customer2.printCustomer();



//        customer.name = "최호진";
//        customer.age = 28;
//        customer.total = 14000;
//        customer.blacklist = true;

//        System.out.println("고객의 이름은?" + customer.name);
//        System.out.println("고객의 나이는?" + customer.age);
//        System.out.println("고객이 총 사용한 금액은?" + customer.total);
//        System.out.println("고객의 블랙리스트인가요?" + customer.blacklist);



    }
}
