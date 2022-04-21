package clock;

public class WorldClock extends Clock {
    private int timeOffset;

    public WorldClock(int offset) {
        this.timeOffset = offset;
    }

    @Override
    public String getHours() {
        int localHours = Integer.parseInt(super.getHours()) + timeOffset;
        return Integer.toString(localHours >= 24 ? localHours - 24 : localHours) ;
    }

    public static void main(String[] args) {
        Clock cl = new Clock();
        cl.setAlarm(14,59);
        System.out.println("Alarm? " + cl.getTime());

        WorldClock wc = new WorldClock(3);
        System.out.println("World time is " + wc.getTime());
    }
}
