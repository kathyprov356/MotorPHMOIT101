package src;
import java.io.*;
import java.io.BufferedReader;

public class Task10TextFile {
	public static void main(String[]args) {
		BufferedReader input;
		
		try {
			input= new BufferedReader (new FileReader("C:\\Users\\magan\\Desktop\\Test\\"
					+ "javalab\\new folder\\netpaywithseed.txt"));
			
		double monthlySal = Double.parseDouble (input.readLine());
		System.out.print("Basic Salary:" + monthlySal);
		{

		    System.out.println("==============================");
		    System.out.println("Government Deduction");
		    System.out.println("==============================");
		    
		    double PagibigCon = 0;
		    if (monthlySal>=1000 && monthlySal <=1500) {
		    PagibigCon =monthlySal*0.01;
		    System.out.println("Pag-ibig Contribution:"+PagibigCon);

		    }else if (monthlySal>1500) {
		    PagibigCon =monthlySal*0.02;
		    }else {
		    System.out.println("Not Applicable.Must reach 1000");
		    return;
		    }
		    System.out.println("Pag-ibig Contribution:"+PagibigCon);
		  
		    
		    double PHcontribution = 0;

		    if (monthlySal>=10000) {
		    	PHcontribution = monthlySal*.03;
		    	
		    }else if (monthlySal<=59999.99) {
		    	
		    	PHcontribution = monthlySal*.05;
		    	
		    }else {
		    	PHcontribution = 1800;
		    	System.out.println("PhilHealth Contribution:"+PHcontribution);
		    	}
		    double employeeShare = PHcontribution/2;
		    System.out.println("PhilHealth Contribution:"+employeeShare);

		    
		    double sssCon = 0;
		   
			if (monthlySal<21750) {
				sssCon=967.50;
				System.out.println("SSS Contribution:"+sssCon);
			}else if (monthlySal>=21750   &&   monthlySal<=22250)  {
				sssCon=990.00;
				System.out.println("SSS Contribution:"+sssCon);
				
			}else if (monthlySal>=22250   &&   monthlySal<=22750)  {
				sssCon=1023.50;
				System.out.println("SSS Contribution:"+sssCon);
				
			}else if (monthlySal>=22750   &&   monthlySal<=23250)  {
				sssCon=1035.00;
				System.out.println("SSS Contribution:"+sssCon);
			}else if (monthlySal>=23250   &&   monthlySal<=23750)  {
				sssCon=1057.50;
				System.out.println("SSS Contribution:"+sssCon);
			}else if (monthlySal>=23750   &&   monthlySal<=24250) {
}
		 double sssCon1 = 0;
		   
			if (monthlySal<21750) {
				sssCon1=967.50;
				System.out.println("SSS Contribution:"+sssCon1);
			}else if (monthlySal>=21750   &&   monthlySal<=22250)  {
				sssCon1=990.00;
				System.out.println("SSS Contribution:"+sssCon1);
				
			}else if (monthlySal>=22250   &&   monthlySal<=22750)  {
				sssCon1=1023.50;
				System.out.println("SSS Contribution:"+sssCon1);
				
			}else if (monthlySal>=22750   &&   monthlySal<=23250)  {
				sssCon1=1035.00;
				System.out.println("SSS Contribution:"+sssCon1);
			}else if (monthlySal>=23250   &&   monthlySal<=23750)  {
				sssCon1=1057.50;
				System.out.println("SSS Contribution:"+sssCon1);
			}else if (monthlySal>=23750   &&   monthlySal<=24250)  {
				sssCon1=1080.00;
				System.out.println("SSS Contribution:"+sssCon1);
			}else if (monthlySal>=24250   &&   monthlySal<=24750)  {
				sssCon1=1102.50;
				System.out.println("SSS Contribution:"+sssCon1);
			}else if (monthlySal>=24750   &&   monthlySal<=999999) {
				sssCon1=1125.00;
			}else {
				sssCon1=0;
				System.out.println("SSS Contribution:"+sssCon1);
				
			}

	double totalGovDeduction = monthlySal-(PagibigCon+PHcontribution+sssCon1);
	System.out.println("Total Gov't Deduction:"+totalGovDeduction);

	double WithholdingTax=0;
	if (monthlySal<=20833) {
		WithholdingTax = 0;
		System.out.println("Withholding Tax:"+WithholdingTax);
	}else if (monthlySal>20833 && monthlySal<=33333) {
		WithholdingTax = 0.2*(monthlySal-20833);
		System.out.println("Withholding Tax:"+WithholdingTax);
	}else if (monthlySal>33333 && monthlySal<=66667 ) {
		System.out.println("Withholding Tax:"+WithholdingTax);    
		WithholdingTax = 2500+0.25*(monthlySal-33333);
		System.out.println("Withholding Tax:"+WithholdingTax);
	}else if (monthlySal> 66667 && monthlySal<=166667) {
		WithholdingTax = 10833+0.30*(monthlySal- 66667);
		System.out.println("Withholding Tax:"+WithholdingTax);
	}else if (monthlySal>166667 && monthlySal<=666667) {
		WithholdingTax = 40833.33+0.32*(monthlySal- 166667);
		System.out.println("Withholding Tax:"+WithholdingTax);
	}else {
		WithholdingTax = 200833.33+0.35*(monthlySal- 666667);
		System.out.println("Withholding Tax:"+WithholdingTax);

	}
		double NetPay = totalGovDeduction -WithholdingTax;
		System.out.println("Net Pay:"+NetPay);
		System.out.println("==============================");
		System.out.println("Net Pay:"+NetPay);
		System.out.println("==============================");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}
				}
}

