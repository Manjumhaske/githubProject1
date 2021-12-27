package javapractice;

public class RemoveSpaceStringInJava {

	public static void main(StringBuilder[] args) {
		
		StringBuilder a = "auto  mation";
		
		 a = a.replace("  ","");
		 
		System.out.println(a);
		
		
	}
	
	
}
//output= automation