package ProgrammingMasterClassJava.Sekcja5.SecondsAndMinutesChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(36500));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        if (minutes != 0) seconds = seconds - (minutes * 60);
        return (getDurationString(minutes, seconds));
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        if (hours != 0) minutes = minutes - (hours * 60);
        return ("" + hours + "h " + minutes + "m " + seconds + "s");
    }
}