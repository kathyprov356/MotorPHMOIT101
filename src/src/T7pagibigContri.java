package src;

	import java.util.Scanner;

	public class T7pagibigContri{
		public static void main (String[] args) {
				Scanner n = new Scanner (System.in);
			System.out.print("Enter Employee Number:");
		    int idNum = n.nextInt();
		    System.out.print("Enter Monthly Rate:");
		    double monthlysal = n.nextInt();
		    
		    double PagibigCon = 0;
		    
		    if (monthlysal>=1000 && monthlysal <=1500) {
		    PagibigCon =monthlysal*0.01;
		System.out.println("Pag-ibig Contribution:"+PagibigCon);
		
		}else if (monthlysal>1500) {
			PagibigCon =monthlysal*0.02;
		}else {
			System.out.println("Not Applicable.Must reach 1000");
			
		}
		System.out.println("Pag-ibig Contribution:"+PagibigCon);
		
		n.close();

		}
		}

