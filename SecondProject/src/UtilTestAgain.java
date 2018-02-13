/**
 * 
 */
import java.util.Calendar;
import java.util.Date;
/**
 * @author User
 *
 */
public class UtilTestAgain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDate());
		
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		String currentCalDate = cal.get(Calendar.DATE)  + " / "  + (cal.get(Calendar.MONTH)+1) + " / " + cal.get(Calendar.YEAR) + "     |      " + cal.get(Calendar.HOUR)  + " : " + cal.get(Calendar.MINUTE) + " : " + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		
		
		int date = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int hourOfDay = Integer.parseInt(args[3]);
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);
		cal.set(year, (month-1), date, hourOfDay, minute, second);
		String mydate = cal.get(Calendar.DATE)  + " / "  + (cal.get(Calendar.MONTH)+1) + " / " + cal.get(Calendar.YEAR) + "     |      " + cal.get(Calendar.HOUR)  + " : " + cal.get(Calendar.MINUTE) + " : " + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();

		
		System.out.println("Inserted Date is :" + mydate );
		System.out.println("Real Date is :" + currentCalDate);
		

	}

}
