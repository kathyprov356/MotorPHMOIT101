package src;


	import java.util.Scanner;


	public class T7whTaxContri {

		public static void main(String[]ars) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter Employee Number:");
	    int idNum = i.nextInt();
	    System.out.print("Enter Employee Name:");
	     String name = i.next();    
	    System.out.print("Enter Monthly Rate:");
	    double monthlysal = i.nextInt();
	    
	    
	    double WithholdingTax = 0;
	    if (monthlysal<=20833) {
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    }else if (monthlysal<=33333) {
	    	WithholdingTax = 0.2*(monthlysal-20833);
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    }else if (monthlysal<=66667) {
	    	System.out.println("Withholding Tax:"+WithholdingTax);    
	    	WithholdingTax = 2500+0.25*(monthlysal-33333);
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    }else if (monthlysal<=166667) {
	    	WithholdingTax = 10833+0.30*(monthlysal- 66667);
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    }else if (monthlysal<=666667) {
	    	WithholdingTax = 40833.33+0.32*(monthlysal- 166667);
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    }else if (monthlysal>666667 ) {
	    	WithholdingTax = 200833.33+0.35*(monthlysal- 666667);
	    	System.out.println("Withholding Tax:"+WithholdingTax);
	    	
	i.close();

	    	
	    }
		}
	}
		

	    	
	    	
	    	
	    
	    

	    
	    
	    
	    
	 







