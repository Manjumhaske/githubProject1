package javapractice;

public class RemoveSpacialChracterString {

	public static void main (StringBuilder[] args) {
		StringBuilder s = "2fbvdbFGHJ@hd@&&nnnv%%nvdbc$$fPPMBBVV0hhv846749hbv##bcb##nvnnRYVVCFHB^nfb*nc*bbdbdcg&&*bc";
		s = s.replaceAll("[^a-zA-Z0-9]","");// 
		System.out.println(s);
	}
	
	
	
	
	
}
