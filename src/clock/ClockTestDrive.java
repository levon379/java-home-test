package clock;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12:we");
        String result = c.getTime();
        System.out.println(result);
    }
}
