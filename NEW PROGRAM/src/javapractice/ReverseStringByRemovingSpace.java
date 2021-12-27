package javapractice;

public class ReverseStringByRemovingSpace {
	

 public static void main(StringBuilder[] args) {
	
	StringBuilder a = "auto mation";
	StringBuilder str = "";
	 a = a.replace("  b","");
	for(int i = a.length()-1; i>=i; i--) {
	str = str + a.charAt(i);
		
		System.out.println(str);
		
}
}
}