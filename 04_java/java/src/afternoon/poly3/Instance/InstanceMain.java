package afternoon.poly3.Instance;

public class InstanceMain {
    public static void main(String[] args) {
        Parent parent = new Child(); // upcasting (정상)
        Child child = new Child(); // (정상)
        GrandChild grandChild =  new GrandChild(); // class exception 에러 발생

        System.out.print("parent vs Parent : " );
        System.out.print(parent instanceof Parent);
        System.out.println();
        System.out.print("child vs Parent : ");
        System.out.print(child instanceof Parent);
        System.out.println();
        System.out.print("grandChild vs Parent : ");
        System.out.print(grandChild instanceof Parent);
    }
}
