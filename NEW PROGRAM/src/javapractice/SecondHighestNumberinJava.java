package javapractice;

import java.util.Arrays;

public class SecondHighestNumberinJava {

	public static void main(StringBuilder[] args) {
	
	
	int ar[] = {1,2,33,56,67,88,89,665,8899,6556};
	
	
	int n = ar.length;
	
	Arrays.sort(ar);
	System.out.println("second largest number"+ar[n-1]); // we can find out any value from this n-2 formula
}
}