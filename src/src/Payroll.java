package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Payroll {

	 private static Scanner scan = new Scanner(System.in);
	    public static void main() throws FileNotFoundException {
	        Scanner inputStream = new Scanner(new File("src\\Payslip.txt"));
	        String line = inputStream.nextLine();
	        DecimalFormat k = new DecimalFormat("Php 000.00");
	        DecimalFormat l = new DecimalFormat("Php 0,000.00");
	        DecimalFormat m = new DecimalFormat("Php 00,000.00");
	        
	        double sss;
	        double pagIbig;
	        double philhealth;
	        double totalDeductions;
	        double tax;
	        double netPayafterTax;
	        double grossAfterdeduct;
	        
	line = inputStream.nextLine();
	            String[] ary = line.split(";");
	            String idnumber = ary[0];
	            String lastName = ary[1];
	            String firstName = ary[2];
	            String birthdate = ary[3];
	            String address = ary[4];
	            String phoneNumber = ary[5];
	            
	            double basicSalary = Double.parseDouble(ary[11]); 
	            double grossSalary = Double.parseDouble(ary[12]);

	StringBuilder name = new StringBuilder();
	            name.append(firstName.strip()).append(" ").append(lastName.strip());



	            sss = basicSalary;
	            if (basicSalary <= 3250) {
	                sss = 135.00;
	            }if (basicSalary > 3250 && basicSalary <= 3750) {
	            sss = 157.50;
	        }if (basicSalary > 3750 && basicSalary <= 4250) {
	            sss = 180.00;
	        }if (basicSalary > 4250 && basicSalary <= 4750) {
	            sss = 202.50;
	        }if (basicSalary > 4750 && basicSalary <= 5250){
	            sss = 225.00;
	        }if( basicSalary > 5250 && basicSalary <= 5750){
	            sss = 247.50;
	        }if (basicSalary > 5750 && basicSalary <= 6250){
	            sss =270.00 ;
	        }if (basicSalary > 6250 && basicSalary <= 6750){
	            sss =292.50 ;
	        }if (basicSalary > 6250 && basicSalary <= 6750){
	            sss =292.50 ;
	        }if(basicSalary > 6750 && basicSalary <= 7250){
	            sss =360.00 ;
	        }if(basicSalary > 7250 && basicSalary <= 7750){
	            sss = 382.50 ;
	        }if(basicSalary > 7750 && basicSalary <= 8250){
	            sss = 405.00 ;
	        } if(basicSalary > 8250 && basicSalary <= 8750){
	            sss = 427.50;
	        } if(basicSalary > 8750 && basicSalary <= 9250){
	            sss = 450.00;
	        } if(basicSalary > 9250 && basicSalary <= 9750){
	            sss = 472.50 ;
	        } if(basicSalary > 9750 && basicSalary <= 10250){
	            sss = 495.00;
	        } if(basicSalary > 10250 && basicSalary <= 10750){
	            sss = 517.50 ;
	        } if(basicSalary > 10750 && basicSalary <= 11250){
	            sss = 540.00;
	        } if(basicSalary > 11250 && basicSalary <= 11750){
	            sss = 562.50 ;
	        } if(basicSalary > 11750 && basicSalary <= 12250){
	            sss = 585.00 ;
	        } if(basicSalary > 12250 && basicSalary <= 12750){
	            sss = 607.50;
	        }if(basicSalary > 12750 && basicSalary <= 13250){
	            sss = 630.00 ;
	        }if(basicSalary > 13250 && basicSalary <= 13750){
	            sss =652.50 ;
	        }if(basicSalary > 13750 && basicSalary <= 14250){
	            sss = 697.50 ;
	        }if(basicSalary > 14250 && basicSalary <= 14750){
	            sss = 720.00 ;
	        }if(basicSalary > 14750 && basicSalary <= 15250){
	            sss = 742.50;
	        }if(basicSalary > 15250 && basicSalary <= 15750){
	            sss = 765.00;
	        }if(basicSalary > 15750 && basicSalary <= 16250){
	            sss =787.50 ;
	        }if(basicSalary > 16250 && basicSalary <= 16750){
	            sss = 810.00;
	        }if(basicSalary > 16750 && basicSalary <= 17250){
	            sss = 832.50 ;
	        }if( basicSalary > 17250 && basicSalary <= 17750){
	            sss = 855.00 ;
	        }if(basicSalary > 17750 && basicSalary <= 18250){
	            sss = 877.50;
	        }if(basicSalary > 18250 && basicSalary <= 18750){
	            sss = 900.00;
	        }if(basicSalary > 18750 && basicSalary <= 19250){
	            sss = 922.50;
	        }if(basicSalary > 19250 && basicSalary <= 19750){
	            sss = 945.50;
	        }if(basicSalary > 19750 && basicSalary <= 20250){
	            sss = 990.00;
	        }if(basicSalary > 20250 && basicSalary <= 20750){
	            sss = 1012.50;
	        }if(basicSalary > 20750 && basicSalary <= 21250){
	            sss = 1035.00;
	        }if(basicSalary > 21250 && basicSalary <= 21750){
	            sss = 1057.50;
	        }if(basicSalary > 21750 && basicSalary <= 22250){
	            sss =1080.00 ;
	        }if(basicSalary > 22250 && basicSalary <= 22750){
	            sss = 1012.50;
	        }if(basicSalary > 22750 && basicSalary <= 23250){
	            sss = 1035.00;
	        }if(basicSalary > 23250 && basicSalary <= 23750){
	            sss = 1057.50;
	        }if(basicSalary > 23750 && basicSalary <= 24250){
	            sss = 1080.00;
	        }if(basicSalary > 24250 && basicSalary <= 24750){
	            sss = 1102.50;
	        }if(basicSalary > 24750 ){
	            sss = 1125.00;
	        }

	philhealth = basicSalary * 0.03 / 2;

	            //formula on get
	            pagIbig = basicSalary < 1500 ? basicSalary * 0.1 : 100;

	            totalDeductions = sss+philhealth+pagIbig;
	            
	    
	            tax = basicSalary - totalDeductions;
	            if (basicSalary > 20832 && basicSalary <= 33333) {
	                tax= (basicSalary - 20833) * 0.20;
	            } else if (basicSalary > 33333 && basicSalary <= 66667) {
	                tax = 2500 + ((basicSalary - 33333) * 0.25);
	            } else if (basicSalary > 66667 && basicSalary <= 166667) {
	                tax = 10833 + ((basicSalary - 66667) * 0.30);
	            } else if (basicSalary > 166667 && basicSalary <= 666667) {
	                tax = 166667 + ((basicSalary - 40833.33) * 0.32);
	            } else if (basicSalary > 666667) {
	                tax = 200833.33 + ((basicSalary - 666667) * 0.35);
	            }
	            
	            grossAfterdeduct = grossSalary - totalDeductions; 
	            netPayafterTax =  grossAfterdeduct- tax;
	            
	            System.out.print(line);
	    }
	    
}
