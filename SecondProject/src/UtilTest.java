/**
 * 
 */
import java.util.Calendar;
import java.util.Date;
/**
 * @author User
 *
 */
public class UtilTest {

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
		
		System.out.println("Current Date is :" + currentCalDate);

	}

}
