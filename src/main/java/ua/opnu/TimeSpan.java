package ua.opnu;

public class TimeSpan {
    private int totalMinutes;

    public TimeSpan() {
        this.totalMinutes = 0;
    }

    public TimeSpan(int minutes) {
        this.totalMinutes = minutes;
    }

    public TimeSpan(int hours, int minutes) {
        this.totalMinutes = hours * 60 + minutes;
    }

    public TimeSpan(TimeSpan other) {
        this.totalMinutes = (other == null) ? 0 : other.totalMinutes;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getHours() {
        return totalMinutes / 60; 
    }

    public int getMinutesPart() {
        int m = Math.abs(totalMinutes % 60);
        return m;
    }

    public void add(int hours, int minutes) {
        this.totalMinutes += hours * 60 + minutes;
    }

    public void add(int minutes) {
        this.totalMinutes += minutes;
    }

    public void add(TimeSpan other) {
        if (other != null) this.totalMinutes += other.totalMinutes;
    }

    public void sub(int hours, int minutes) {
        this.totalMinutes -= (hours * 60 + minutes);
    }

    public void sub(int minutes) {
        this.totalMinutes -= minutes;
    }

    public void sub(TimeSpan other) {
        if (other != null) this.totalMinutes -= other.totalMinutes;
    }

    @Override
    public String toString() {
        int h = getHours();
        int m = getMinutesPart();
        if (totalMinutes < 0 && (totalMinutes % 60) != 0) {
        }
        return String.format("TimeSpan: %d ч %d мин (всего %d мин)", h, m, totalMinutes);
    }
}
