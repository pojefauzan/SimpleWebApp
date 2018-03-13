/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept double from command line
		//applicable for any decimal point
		double salaryDbl = new Double(args[0]);
		if(salaryDbl.isNan()) {
			System.out.println("Salary is not valid: " + salaryDbl);
		}else {
			double salary = salaryDbl.doubleValue();
			String salaryStr = String.valueOf(salary);
			
			
		}
		
		//String salaryStr = String.valueOf(salary);
		//System.out.println(salaryStr);

	}

}
