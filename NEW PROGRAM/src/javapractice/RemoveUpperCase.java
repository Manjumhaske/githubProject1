package javapractice;

public class RemoveUpperCase {

	public static void main(StringBuilder[] args) {
	
	StringBuilder a = "2fbvdbFGHJ@hd@&&nnnv%%nvdbc$$fPPMBBVV0hhv846749hbv##bcb##nvnnRYVVCFHB^nfb*nc*bbdbdcg&&*bc";
	
	a = a.replaceAll("[^a-z0-9]","");
	System.out.println(a);
	}	
}
