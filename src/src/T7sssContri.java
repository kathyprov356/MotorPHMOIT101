package src;

	import java.util.Scanner;
	public class T7sssContri {
		
		public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		
		System.out.print("Enter Employee Number:");
		int idNumber = n.nextInt();
		System.out.print("Enter Employee Name:");
	    String name = n.next();  
		System.out.print("Enter Basic Salary:");
		double BasicSalary = n.nextDouble();
		
		double sssCon;
		
		if (BasicSalary<21750) {
			sssCon=967.50;
			System.out.println ("SSS Contribution:"+sssCon);
		}else if (BasicSalary>=21750 && BasicSalary<=22250)  {
			sssCon=990.00;
			System.out.println ("SSS Contribution:"+sssCon);
			
		}else if (BasicSalary>=22250 && BasicSalary<=22750)  {
			sssCon=1023.50;
			System.out.println ("SSS Contribution:"+sssCon);
			
		}else if (BasicSalary>=22750 && BasicSalary<=23250)  {
			sssCon=1035.00;
			System.out.println ("SSS Contribution:"+sssCon);
		}else if (BasicSalary>=23250 && BasicSalary<=23750)  {
			sssCon=1057.50;
			System.out.println ("SSS Contribution:"+sssCon);
		}else if (BasicSalary>=23750 && BasicSalary<=24250)  {
			sssCon=1080.00;
			System.out.println ("SSS Contribution:"+sssCon);
		}else if (BasicSalary>=24250 && BasicSalary<=24750)  {
			sssCon=1102.50;
			System.out.println ("SSS Contribution:"+sssCon);
		}else if (BasicSalary>24750 && BasicSalary<=999999)  {
			sssCon=1125.00;
			System.out.println ("SSS Contribution:"+sssCon);
		
		}
		
		}
	}
		
		

