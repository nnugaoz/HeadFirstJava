import java.util.Calendar;
public class CalendarTestDriver{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(2019,1,21,10,30);
		System.out.println("Current Time:"+c.getTime());
		
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		
		c.setTimeInMillis(day1);
		System.out.println("Add one hour:"+c.getTime());
	}
}