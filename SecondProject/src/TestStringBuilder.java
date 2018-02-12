
public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "Studying";
		System.out.println("Given string " + sb + " with length : " +sb.length());
		System.out.println("First 3 characters are  " + sb.substring(0,3));
		System.out.println("Last 3 characters are  " + sb.substring((sb.length()-3)));
		
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print Studying : " + sb.substring(startOfConstant,endOfConstant));
		
		//Insert name after "am"
		sb.insert((sb.indexOf("am")+2), " Fauzan");
		System.out.println("After insert : " + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am") +2);
		System.out.println("After delete : " + sb);
		sb=null;
	}

}
