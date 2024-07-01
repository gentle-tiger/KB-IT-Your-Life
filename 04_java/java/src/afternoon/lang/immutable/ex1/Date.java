package afternoon.lang.immutable.ex1;

// 불변객체 이전의 코드
public class Date {
    private int year;
    private int month;
    private int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // 멤버 변수 모두에 getter, setter 다 필요하다 .


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
