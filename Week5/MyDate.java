package Week5;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int setYear() {
        return this.year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
