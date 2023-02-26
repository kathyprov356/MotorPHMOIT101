package src;

	import java.util.Scanner;

	public class T7philhealthContri {
		public static void main (String[] args) {
	Scanner i= new Scanner (System.in);
	
	System.out.print("Enter Employee Number:");
	int idNum =i.nextInt();
	System.out.print("Enter Monthly Rate:");
	double monthlysal = i.nextInt();

	double PHcontribution;

	if (monthlysal>=10000) {
		PHcontribution = monthlysal*.03;
		
	}else if (monthlysal<=59999.99) {
		PHcontribution = monthlysal*.05;
		
	}else {
		PHcontribution = 1800;
		System.out.println("PhilHealth Contribution:"+PHcontribution);
		}
	double employeeShare = PHcontribution/2;
	System.out.println("PhilHealth Contribution:"+employeeShare);
	}
	}

