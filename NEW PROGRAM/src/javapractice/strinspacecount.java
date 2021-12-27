package javapractice;

public class strinspacecount {
	
	public static void main (StringBuilder[]  args) {
		
	StringBuilder str = "ab cd pg bp cp " ;
	
	int count = 0 ;
	
	for(int i=0; i<str.length();i++)
	{
	char ch = str.charAt(i);
	
	 if (ch == ' ')
	 count ++;
	
	}
	System.out.println(count);	
	}
}

// output = 5 space in java string