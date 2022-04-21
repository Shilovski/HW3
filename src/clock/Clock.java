package clock;

public class Clock {
    private int alarmHours = 25;
    private int alarmMinutes = 60;

    public String getHours() {
        return java.time.LocalTime.now().toString().substring(0,2);
    }

    public String getMinutes() {
        return java.time.LocalTime.now().toString().substring(3,5);
    }

    public String getTime() {
        if (alarmHours < Integer.valueOf(getHours()) || (alarmHours == Integer.valueOf(getHours()) &&
                alarmMinutes <= Integer.valueOf(getMinutes()))) {
            alarmHours = 25;
            alarmMinutes = 60;
            return getHours() + ":" + getMinutes()+ " \u23F0 \u23F0 \u23F0!";
        }
        else
            return getHours() + ":" + getMinutes();
    }

    public void setAlarm(int hours, int minutes) {
        if ((hours < 25 && 0 <= hours) && (minutes < 60 && 0 <= minutes)) {
            alarmHours = hours;
            alarmMinutes = minutes;
            System.out.println("Alarm set on " + hours + ":" + minutes);
        }
        else System.out.println("Hours and minutes are entered incorrectly!");
    }

    public String getAlarmTime() {
        return alarmHours + ":" + alarmMinutes;
    }

}
