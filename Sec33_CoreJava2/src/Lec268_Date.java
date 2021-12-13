import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Lec268_Date   {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		//System.out.print(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sd.format(d));
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(0));
	}

}