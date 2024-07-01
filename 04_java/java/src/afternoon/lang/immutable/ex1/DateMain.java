package afternoon.lang.immutable.ex1;

public class DateMain {
    public static void main(String[] args) {


    Date date1 = new Date(2024, 7, 1);
    Date date2 = date1;

        System.out.println("date의 년도만 2025년으로 변경");
        date2.setYear(2025);

//      불변객체가 아닐 시 date1을 참조하는 date2의 year의 값을 변경했을 때,
//      date를 참조하는 date1과 date2의 year의 값이 전부 동일하게 바뀌는 것을 알 수 있다.
//      새롭게 생성한 인스턴스들이 모두 date 클래스의 주소값을 참조하는 것이다.
        System.out.println("date1 = " + date1); //  Date{year=2025, month=7, day=1}
        System.out.println("date2 = " + date2); //  Date{year=2025, month=7, day=1}
        }
}
