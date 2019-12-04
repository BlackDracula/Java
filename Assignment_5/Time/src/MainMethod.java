public class MainMethod {
    public static void main(String[] args) {
        Time time = new Time(555550000);
        Time time2 = new Time();
        System.out.printf("%d:%d:%d%n%n",
            time2.getHour(),
            time2.getMinute(),
            time2.getSecond());

        System.out.printf("%d:%d:%d%n%n",
            time.getHour(),
            time.getMinute(),
            time.getSecond());

        time2.setTime(2432423534L);
        System.out.printf("%d:%d:%d%n%n",
            time2.getHour(),
            time2.getMinute(),
            time2.getSecond());
    }
}
