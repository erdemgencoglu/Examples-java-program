
public class Clock {

	private String name;
	private int hour;
	private int minute;
	private int second;

	/*İlk Değerlerini atadığımız method*/
	public Clock() {
		setHour(0);
		setMinute(0);
		setSecond(0);
	}
	public Clock(String name, int hour, int minute, int second) {
	
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public Clock(Clock clock) {
        setHour(clock.getHour());
        setMinute(clock.getMinute());
        setSecond(clock.getSecond());
        setName(clock.getName());
	}
	
	public void setClock(int hours, int minutes, int seconds) {
            setHour(hours);
            setMinute(minutes);
            setSecond(seconds);
	}
	public String getClock() {
        String time;
        time = String.format("%2d:%2d:%2d", getHour(), getMinute(), getSecond());
        return time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHour(int hour) {
	    if (hour > 23 || hour < 0)
            hour = 0;
        this.hour = hour;
	}
	public void setMinute(int minute) {
		 if (minute > 59 || minute < 0)
            minute = 0;
		this.minute = minute;
	}

	public void setSecond(int second) {
	       if (second > 59 || second < 0)
            second = 0;
		this.second = second;
	}
	

	public String getName() {
		return name;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}


	public int getSecond() {
		return second;
	}
	
	
	public void incrementHours(int hours) {
        hour = (hour + hours) % 24;
        if (hour < 0)//Check if user decrements hour
            hour += 24;
	}

	public void incrementMinutes(int minutes) {
            if (minute + minutes >= 60 || minute + minutes < 0)
                incrementHours((minute + minutes) / 60);
            minute = (minute + minutes) % 60;
            if (minute < 0)
                minute += 60;
	}

	public void incrementSeconds(int seconds) {
        if (second + seconds >= 60 || second + seconds < 0)
            incrementMinutes((second + seconds) / 60);
        second = (second + seconds) % 60;
        if (second < 0)
            second += 60;
	}
	public void displayTime() {
        System.out.println(String.format("%s - %s", getName(), getClock()));
	}


	
}
