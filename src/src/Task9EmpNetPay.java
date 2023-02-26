package src;

import java.util.Scanner;

//Task 9: Salary Calculation Based on Hours Worked
//Get SSS Contribution 
//Get PagIbig Contribution
//Get PhilHealth Contribution /2 (Employee share 50%)
//Get The Total GovernmentDeduction
//Applied Tax on after all the deduction and Get Net Pay

class Task9EmpNetPay {
	public static void main(String[]ars) {
		Scanner mSal = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		System.out.println("Enter Employee Number:");
	    int idNum = p.nextInt();
	    System.out.println("Enter Employee Name:");
	     String name = p.next();    
	    System.out.println("Enter Monthly Rate:");
	    double monthlysal = mSal.nextDouble();
	
	    
	    
	
	    System.out.println("==============================");
	    System.out.println("Government Deduction");
	    System.out.println("==============================");
	    
	    
	    
	    double PagibigCon = 0;
	    if (monthlysal>=1000 && monthlysal <=1500) {
	    PagibigCon =monthlysal*0.01;
	    System.out.println("Pag-ibig Contribution:"+PagibigCon);

	    }else if (monthlysal>1500) {
	    PagibigCon =monthlysal*0.02;
	    }else {
	    System.out.println("Not Applicable.Must reach 1000");
	    return;
	    }
	    System.out.println("Pag-ibig Contribution:"+PagibigCon);
	  
	    
	    double PHcontribution = 0;

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

	    
	    double sssCon = 0;
	   
		if (monthlysal<21750) {
			sssCon=967.50;
			System.out.println("SSS Contribution:"+sssCon);
		}else if (monthlysal>=21750   &&   monthlysal<=22250)  {
			sssCon=990.00;
			System.out.println("SSS Contribution:"+sssCon);
			
		}else if (monthlysal>=22250   &&   monthlysal<=22750)  {
			sssCon=1023.50;
			System.out.println("SSS Contribution:"+sssCon);
			
		}else if (monthlysal>=22750   &&   monthlysal<=23250)  {
			sssCon=1035.00;
			System.out.println("SSS Contribution:"+sssCon);
		}else if (monthlysal>=23250   &&   monthlysal<=23750)  {
			sssCon=1057.50;
			System.out.println("SSS Contribution:"+sssCon);
		}else if (monthlysal>=23750   &&   monthlysal<=24250)  {
			sssCon=1080.00;
			System.out.println("SSS Contribution:"+sssCon);
		}else if (monthlysal>=24250   &&   monthlysal<=24750)  {
			sssCon=1102.50;
			System.out.println("SSS Contribution:"+sssCon);
		}else if (monthlysal>=24750   &&   monthlysal<=999999) {
			sssCon=1125.00;
		}else {
			sssCon=0;
			System.out.println("SSS Contribution:"+sssCon);
			
		}

			double totalGovDeduction = monthlysal-(PagibigCon+PHcontribution+sssCon);
			System.out.println("Total Gov't Deduction:"+totalGovDeduction);

double WithholdingTax=0;
if (monthlysal<=20833) {
	WithholdingTax = 0;
	System.out.println("Withholding Tax:"+WithholdingTax);
}else if (monthlysal>20833 && monthlysal<=33333) {
	WithholdingTax = 0.2*(monthlysal-20833);
	System.out.println("Withholding Tax:"+WithholdingTax);
}else if (monthlysal>33333 && monthlysal<=66667 ) {
	System.out.println("Withholding Tax:"+WithholdingTax);    
	WithholdingTax = 2500+0.25*(monthlysal-33333);
	System.out.println("Withholding Tax:"+WithholdingTax);
}else if (monthlysal> 66667 && monthlysal<=166667) {
	WithholdingTax = 10833+0.30*(monthlysal- 66667);
	System.out.println("Withholding Tax:"+WithholdingTax);
}else if (monthlysal>166667 && monthlysal<=666667) {
	WithholdingTax = 40833.33+0.32*(monthlysal- 166667);
	System.out.println("Withholding Tax:"+WithholdingTax);
}else {
	WithholdingTax = 200833.33+0.35*(monthlysal- 666667);
	System.out.println("Withholding Tax:"+WithholdingTax);

}
	double NetPay = totalGovDeduction -WithholdingTax;
	System.out.println("Net Pay:"+NetPay);
	System.out.println("==============================");
	System.out.println("Net Pay:"+NetPay);
	System.out.println("==============================");
	
	
	
	

			}
		}
		
	

