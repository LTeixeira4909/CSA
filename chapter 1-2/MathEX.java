
public class MathEX {
    public static void main(String[] args) {
        int y = swap(483);
        System.out.println(y);
        int x = swap(357);
        System.out.println(x);
        int w = swap(692);
        System.out.println(w);
        timeLeft(2, 35, 7, 31);
        timeLeft(4, 12, 6, 56);

        System.out.println(dayOfWeek(3, 1));
        System.out.println(dayOfWeek(4, 1));
    }

    public static int swap(int z) {
        int result = z / 100 * 100 + z % 10 * 10 + z % 100 / 10;
        return result;
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int m = (depHour * 60 + depMin) - (curHour * 60 + curMin);
        int o = m / 60;
        int p = m % 60;
        System.out.println(o + " hours " + p + " minutes");

    }

    public static int dayOfWeek(int daysOfWeek, int day) {
        int result = (daysOfWeek + day) % 7;
        return result;
    }
}