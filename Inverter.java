package March9th;

import java.util.Scanner;

public class Inverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Myscan = new Scanner(System.in);
		
		System.out.println("How many AC unit? Input:");
		int numberofAC = Myscan.nextInt();
		int numberofInverter=0;
		int numberofNonInverter=0;
		String I =new String("I");
		String numberofAC1 = Myscan.nextLine();
		
		for(int i=0; i<numberofAC; i++) {
			System.out.println("Enter List of AC:");
			String ACType= Myscan.nextLine();
			
			if(ACType.toUpperCase().equals(I)) {
				
				numberofInverter++;
			}else{
				numberofNonInverter=numberofNonInverter+1;
			}
			
		}
		
		System.out.println("O/P");
		System.out.println("Number of Inverer AC:" + numberofInverter);
		
		System.out.println("Number of NonInverer AC:" + numberofNonInverter);
		
		
		

	}

}
