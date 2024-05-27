package org.design;

public class Interval {
    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    Day day;
    Date date;

    int start_hour;
    int end_hour;

}
