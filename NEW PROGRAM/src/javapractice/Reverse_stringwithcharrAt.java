package javapractice;

public class Reverse_stringwithcharrAt {

	public static void main(StringBuilder[] args) {
	
	StringBuilder st = "manjusha";
	char[] chars =st.toCharArray();
	
	for(int i = st.length()-1; i>=0; i--)
	{
	  System.out.print(chars[i]);
	}	
}
}