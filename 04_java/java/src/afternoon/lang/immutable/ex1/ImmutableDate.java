package afternoon.lang.immutable.ex1;

public class ImmutableDate {
    private final int year;
    private final int month;
    private final int day;


    public ImmutableDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // 멤버 변수 모두에 getter, setter 다 필요하다 .


    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }


    public ImmutableDate setYear(int year){
        return new ImmutableDate(year,this.month, this.day);
    }

    public ImmutableDate setMonth(int month){
        return new ImmutableDate(this.year, month, this.day);
    }

    public ImmutableDate setDay(int day){
        return new ImmutableDate(this.year, this.month, day);
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
