package afternoon.pack;

// import
import afternoon.pack.a.Boss;
import afternoon.pack.nouveau.Customer;
public class PackageMain {
    public static void main(String[] args) {


        Customer customer1 = new Customer();
        // 다른 위치에 있는 Customer 클래스를 가져옴. -> import 이후에는 둘 다 nouveau에서 가져온 Customer 클래스다.
        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();

        String bossName = "최호진";
        int bossAge = 28;
        Boss boss = new Boss(bossName,bossAge); // 부모 클래스에 name, age를 받는 메서드가 생성자가 있음. 그렇기 떄문에 받을 수 있는 것임.

        boss.printBoss();

    }


}
