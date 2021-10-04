package utils;

public class TimeUtil {

    public static String formatIntoDetailedShorthand(int secs) {
        if (secs == 0) {
            return "0s";
        }
        int remainder = secs % 86400;


        int days = secs / 86400;
        int hours = remainder / 3600;
        int minutes = (remainder / 60) - (hours * 60);
        int seconds = (remainder % 3600) - (minutes * 60);

        String fDays = (days > 0 ? " " + days + "d" : "");
        String fHours = (hours > 0 ? " " + hours + "h" : "");
        String fMinutes = (minutes > 0 ? " " + minutes + "m" : "");
        String fSeconds = (seconds > 0 ? " " + seconds + "s" : "");

        return ((fDays + fHours + fMinutes + fSeconds).trim());
    }

    public static String formatDuration(long duration, boolean verbose) {
        long ms = duration % 1000L; // ms
        long toSecond = (duration - ms); // ms
        long sec = (toSecond / 1000L) % 60L; // sec
        long toMinute = ((toSecond / 1000) - sec); // sec
        long min = (toMinute / 60) % 60; // min
        long toHour = ((toMinute / 60) - min); // min
        long hour = (toHour / 60) % 24; // hour
        long toDay = ((toHour / 60) - hour); // hour
        long day = (toDay / 24) % 7; // day
        long toWeek = ((toDay / 24) - day); // day
        long week = (toWeek / 7) % 4; // week
        long toMonth = ((toWeek / 7) - week); // week
        long month = (toMonth / 4) % 12; // month
        long toYear = ((toMonth / 4) - month); // month
        long year = toYear / 12; // year


        if (verbose)
            return String.format("%d years, %d months, %d weeks, %d days, %d hours, %d minutes, and %d seconds.", year, month, week, day, hour, min, sec);
        return String.format("%d;%d;%d;%d;%d;%d;%d", year, month, week, day, hour, min, sec);
    }
}
