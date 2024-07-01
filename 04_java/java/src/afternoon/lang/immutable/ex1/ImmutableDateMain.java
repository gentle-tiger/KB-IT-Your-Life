package afternoon.lang.immutable.ex1;

public class ImmutableDateMain {
    public static void main(String[] args) {


        ImmutableDate date1 = new ImmutableDate(2024, 7, 1);
        ImmutableDate date2 = date1;

        System.out.println("date2의 년도만 2025년으로 변경");
//      date2 에 담지 않으면 해당 데이터는 가비지 데이터가 된다.
        date2 = date2.setYear(2025);
//        date2.setMonth(7);
//        date2.setDay(7);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        }
}
