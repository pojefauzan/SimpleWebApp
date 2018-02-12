import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(10);
		System.out.println("Array list is empty: " + al.isEmpty());
		
		for (String str:args) {
			al.add(str);
			
		}
		System.out.println("Array list is empty: " + al.isEmpty());
		System.out.println(al);

	}

}
