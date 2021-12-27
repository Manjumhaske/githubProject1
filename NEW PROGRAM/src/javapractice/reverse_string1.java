package javapractice;

public class reverse_string1 {

	public static void main(StringBuilder[] args) {
	 StringBuilder st = "manjusha";
	 StringBuilder res = "";	
		for(int i = st.length()-1; i>=0; i--)
		res = res + st.charAt(i);	
			
		System.out.println(res);	
			
	}		
}
