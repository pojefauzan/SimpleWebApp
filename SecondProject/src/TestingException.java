/**
 * 
 */

/**
 * @author User
 *
 */
public class TestingException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			System.out.println("Your name is : " + args[0]);
		//	System.out.println("Name printed..");
			if(!(name.startsWith("M"))) {
				throw new Exception("Name should start with M");
				
			}
			
		}
		catch (ArrayIndexOutOfBoundsException ae) { 
			System.out.println(
					"Please provide your name as Command line parameter. eg:" + "java TestingExceptions <Your Name>");
	}catch (Exception ex) {
		System.out.println(ex.getMessage());
	
		}
		System.out.println("I am done..");
	}

}
