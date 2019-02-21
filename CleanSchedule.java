import java.util.ArrayList;
import java.util.Calendar;

class CWeek{
	private String name;
	private Calendar beginDate;
	private ArrayList<Calendar> weekDays;
	
	public ArrayList<Calendar> getWeekDays(){
		return weekDays;
	}
	
	public String getName(){
		return name;
	}
	
	public Calendar getBeginDate(){
		return beginDate;
	}
	
	public CWeek(String pName, Calendar pBeginDate){
		name = pName;
		beginDate = (Calendar)pBeginDate.clone();
		weekDays = new ArrayList<Calendar>();
		
		for(int i=0;i<7;i++){
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(beginDate.getTimeInMillis());
			c.add(Calendar.DAY_OF_MONTH,i);
			weekDays.add(c);
		}
	}
}

class Semester{
	private Calendar beginDate;
	private Calendar endDate;
	private ArrayList<CWeek> weeks;
	
	public ArrayList<CWeek> getWeeks(){
		return weeks;
	}
	
	public Semester(Calendar pBeginDate, Calendar pEndDate){
		beginDate = pBeginDate;
		endDate = pEndDate;
		
		Calendar c = Calendar.getInstance();
		c.setTime(beginDate.getTime());
		
		weeks = new ArrayList<CWeek>();
		int weekIndex = 1;
		
		while(c.compareTo(endDate)<0){
			CWeek w = new CWeek(weekIndex+"",c);
			weeks.add(w);
			weekIndex++;
			c.add(Calendar.DAY_OF_MONTH,7);
		}		
	}
}

public class CleanSchedule{
	public static void main(String[] args){
		Calendar beginDate = Calendar.getInstance();
		beginDate.set(2019,1,18);
		Calendar endDate = Calendar.getInstance();
		endDate.set(2019,6,10);
		
		Semester sem = new Semester(beginDate, endDate);		
		
		for(CWeek eachWeek : sem.getWeeks()){
			//System.out.println("--------" + eachWeek.getName() + "--------");
			for(Calendar eachDay : eachWeek.getWeekDays()){
				//System.out.println(eachDay.get(Calendar.YEAR) + "/" + (eachDay.get(Calendar.MONTH) + 1) + "/" + eachDay.get(Calendar.DATE) + "\t" + (eachDay.get(Calendar.DAY_OF_WEEK) -1));
			}
		}
		System.out.println("--------Clean Date--------");
		for(int i=1;i<=sem.getWeeks().size();i++){
			if(i%2==0){				
				Calendar cleanDate = Calendar.getInstance();
				cleanDate.setTime(sem.getWeeks().get(i-1).getBeginDate().getTime());
				cleanDate.add(Calendar.DAY_OF_MONTH,4);				
				System.out.println(cleanDate.get(Calendar.YEAR) + "/" + (cleanDate.get(Calendar.MONTH) + 1) + "/" + cleanDate.get(Calendar.DATE) + "\t" + (cleanDate.get(Calendar.DAY_OF_WEEK) -1));
			}
		}			
	}
}
