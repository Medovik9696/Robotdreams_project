package Lesson_17;

public class EnumTest {
    public static void main(String[] args) {
        String ourDay = returnDayOfWeek(1);
        System.out.println(ourDay);
        String ourDay2 = returnDayOfWeek(2);
        System.out.println(ourDay2);
        String ourDay5 = returnDayOfWeek(5);
        System.out.println(ourDay5);
    }

    static String returnDayOfWeek(int i) {
        String dayOfWeek = null;
        switch (i) {
            case 1:
                return String.valueOf(WeeksDays.Monday);
            case 2:
                return String.valueOf(WeeksDays.Tuesday);
            case 3:
                return String.valueOf(WeeksDays.Wednesday);
            case 4:
                return String.valueOf(WeeksDays.Thursday);
            case 5:
                return String.valueOf(WeeksDays.Friday);
            case 6:
                return String.valueOf(WeeksDays.Saturday);
            case 7:
                return String.valueOf(WeeksDays.Sunday);
        }
        return dayOfWeek;
    }
}



