// for Loop
// Program to print a sentence 10 times

class ForLoop {
   public static void main(String[] loop) {
	  // String myVar = "Nothing";
	   //int a = Integer.parseInt(loop[0]);
	   StringBuilder sb = new StringBuilder(10);
	   sb.append("Nothing");
	   System.out.println("sb: " + sb);
	   
	   
      for (int i = 1; i <= 10; ++i) {
         System.out.println("Sb at line " +i + " with value : " + sb);
         sb.append ("-" + i);
         
      }
   }
}