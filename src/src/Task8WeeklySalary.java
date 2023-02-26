package src;



import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Task8WeeklySalary {
    
	// Task 8: Calculated Salary Based on Hours Work
	
	
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        JTextArea myArea = new JTextArea(15,15);
        DecimalFormat f= new DecimalFormat("P0,000.000");
        
        
       
        final int STANDARD_WORK=40;
        String Enumber;
        String Name;
        double hoursWorked;
        double hourlyRate;
        double basicPay;
        double overTime=0;
        double overTimeRate=0;
        double overTimePay=0;
        double grossSalary=0;
        
        System.out.print("Enter Employee Number: ");
        Enumber = keyboard.nextLine();
        
        System.out.print("Enter Employee Name: ");
        Name = keyboard.nextLine();
        
        System.out.print("Enter the no. of Hours Worked: ");
        hoursWorked = keyboard.nextDouble();
        
        System.out.print("Enter the hourlyRate: ");
        hourlyRate = keyboard.nextDouble();
        
        //Process
        if(hoursWorked <= STANDARD_WORK) {
            basicPay = hoursWorked * hourlyRate;
            grossSalary = basicPay;
            
        }
        else {
            basicPay = STANDARD_WORK * hourlyRate;
            overTime = hoursWorked - STANDARD_WORK;
            overTimeRate = hourlyRate * 1.5; 
            overTimePay = overTimeRate * overTime; 
            grossSalary = basicPay + overTimePay;
        }
        
        //Print PaySlip
        myArea.setEditable(false);
        myArea.setFont(new Font("Arial",Font.BOLD,28));
        myArea.setText(
            "\tMOTORPH COMPANY\n\t PAYSLIP\n\n=============================================" +
            "\nEmployeeNumber:\t\t" + Enumber +
            "\nName:\t\t" + Name +
            "\nHoursWorked:\t\t" + hoursWorked +
            "\nHourlyRate:\t\t" + hourlyRate +
            "\nOverTime:\t\t" + overTime +
            "\nOverTimeRate:\t\t" + overTimeRate +
            "\nOverTimePay:\t\t" + f.format(overTimePay) +
            "\nBasicPay:\t\t" + f.format(basicPay) +
            "\nGrossSalary:\t\t" + f.format(grossSalary)); 
                
        JOptionPane.showMessageDialog(
                null, myArea, "Payslip", JOptionPane.PLAIN_MESSAGE);
        
        
        //Print Payroll Report
                System.out.println();
                System.out.printf("%45s\n","MotorPH Company");
                System.out.printf("%50s\n\n","WEEKLY PAYROLL REPORT");
                System.out.printf("%-8s%-12s%-8s%-6s%-6s%-8s%-11s%-11s%-11s\n", 
                        "Enumber","Name","    HWorked","  HRate","  OT","  OTRate","  OTPay"," BasicPay",
                        "   GrossSalary");
                System.out.printf(
                        "%-8S%-18S%-8.1f%-6.1f%-6.1f%-8.1fP%,-11.2fP%,-11.2fP%-,11.2f", 
                            Enumber,Name, hoursWorked, hourlyRate, overTime, overTimeRate,
                            overTimePay, basicPay, grossSalary);
}
}

