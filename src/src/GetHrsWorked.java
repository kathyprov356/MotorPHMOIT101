package src;



	import java.time.LocalTime;
	import java.time.temporal.ChronoUnit;
	import java.time.*;
	import java.util.Scanner;


	public class GetHrsWorked{
		private static LocalDate date;

		public static void main (String[] args) {
			Scanner s = new Scanner (System.in);
		System.out.print("Enter Employee Number:");
		int idNumber = s.nextInt();
		System.out.print("Date Worked:");
		  int date = s.nextInt (); 
		

			LocalTime timeIn = LocalTime.of(8,00);
			LocalTime timeOut = LocalTime.of(17,00);
			long differenceInMinutes = ChronoUnit.MINUTES.between(timeIn, timeOut);
			
			double differenceInDecimal = (double) differenceInMinutes/60;
			System.out.println("Time difference:" + differenceInMinutes  + "minutes");
			System.out.println ("Time difference: " + differenceInDecimal + "hours");
					
}
	}
