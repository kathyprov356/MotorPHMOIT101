package src;


	import java.util.Scanner;

	public class Task6BasicEmployeeDetails {

		public static void main(String[] args) {
			Scanner input = new Scanner (System. in);
			String Lname, Fname, Birthday, Address, Phonenumber, Gender, Position, ISupervisor, BasicSal, RiceSub, PhoneAllow, 
			ClothingAllow, Status, SSSnumber, Philhealth, Tinnumber, Pagibig;
			
			//Task 6&7: CODE STRUCTURE AND CORRECT DATA TYPE
			//Employee Information
			//To Display Employee Number, Employee Name, Employee Birthday  
		
			
		int idnumber;
		System.out.println("Enter Employee Number:\n");
		idnumber= input.nextInt();
			
		
		input. close ();
		
		switch (idnumber)
		{
		
		case 10001:
			
			
			
		Fname = "Jose";
		Lname = "Crisostomo";
		Birthday = "February 14, 1988";
		Address = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ";
		Phonenumber = "+63-918-621-603";
		Gender = "Male";
		Position = "HR Manager";
		ISupervisor = "N/A";
		BasicSal = "62, 670";
		RiceSub = "1, 500";
		PhoneAllow = "1, 000";
		ClothingAllow = "1, 000";
		SSSnumber = "49-1632020-8";
		Philhealth = "382189453145";
		Tinnumber = "317-674-022-000";
		Pagibig = "441093369646";
		Status = "Regular";
		BasicSal = "62670";
		
		
		
		
		System.out.println("--- BASIC EMPLOYEE INFORMATION ----\n");
		System.out.println("Last Name:" + Lname);
		System.out.println("First Name:" + Fname);
		System.out.println("Date of Birth:" + Birthday);
		System.out.println("Address:" + Address);
		System.out.println("Contact Number: " + Phonenumber);
		System.out.println("Gender:" + Gender);
		System.out.println("Job Title:" + Position);
		System.out.println("Immediate Supervisor:" + ISupervisor);
		System.out.println("Date Hired:" );
		System.out.println("Basic Salary:" + BasicSal);
		System.out.println("Subsidy:" + RiceSub);
		System.out.println("Phone Allowance: " + PhoneAllow);
		System.out.println("Clothing Allowace: " + ClothingAllow);
		System.out.println("SSS Number:" + SSSnumber);
		System.out.println("Philhealth Number:" + Philhealth);
		System.out.println("Tin Number:" + Tinnumber);
		System.out.println("Pag-ibig Number:" + Pagibig);
		System.out.println("Status:" + Status);
		System.out.println("Basic Salary:" + BasicSal);
		
		float floatValue=373.04f;
		String format = String.format("Hourly Rate:"+ floatValue,args);
		System.out.print(format);
		
		
		
		
		break;
		

		case 10002:
			
		
		
	Fname = "Christian"; 
	Lname = "Mata";
	Birthday = "October 21, 1987";
	Address = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu  ";
	Phonenumber = "+63-783-776-744";
	Gender = "Male";
	Position = "Account Team Leader";
	ISupervisor = "Romualdez, Fredrick";
	BasicSal = "42, 975";
	RiceSub = "1, 500";
	PhoneAllow = "800";
	ClothingAllow = "800";
	SSSnumber = "49-2959312-6";
	Philhealth = "824187961962";
	Tinnumber = "103-100-522-000";
	Pagibig = "631052853464";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue2=255.80f;
	System.out.print(String.format("Hourly Rate:"+ floatValue2,args));

		
		break;

		case 10003:


	Fname = "Brad ";
	Lname = "San Jose";
	Birthday = "March 15, 1996";
	Address = "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi  ";
	Phonenumber = "+63-797-009-261";
	Gender = "Male";
	Position = "HR Team Leader";
	ISupervisor = "Crisostomo, Jose";
	BasicSal = "42, 975";
	RiceSub = "1, 500";
	PhoneAllow = "800";
	ClothingAllow = "800";
	SSSnumber = "40-2400714-1";
	Philhealth = "239192926939";
	Tinnumber = "672-474-690-000";
	Pagibig = "210850209964";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue3=255.80f;
	System.out.print(String.format("Hourly Rate:"+ floatValue3,args));

	break;

		case 10004:
		


	Fname = "Anthony ";
	Lname = "Salcedo";
	Birthday = "September 14, 1993";
	Address = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate ";
	Phonenumber = "+63-070-766-300";
	Gender = "Male";
	Position = "Payroll Manager";
	ISupervisor = "Crisostomo, Jose";
	BasicSal = "60, 825";
	RiceSub = "1, 500";
	PhoneAllow = "1000";
	ClothingAllow = "1000";
	SSSnumber = "26-9647608-3";
	Philhealth = "126445315651";
	Tinnumber = "210-805-911-000";
	Pagibig = "218002473454";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);

	float floatValue4=362.05f;
	System.out.print(String.format("Hourly Rate:"+ floatValue4,args));

	break;

		case 10005:
		


	Fname = "Alice";
	Lname = "Romualdez";
	Birthday = "May 14, 1992";
	Address = "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte   ";
	Phonenumber = "+63-983-606-799";
	Gender = "Female";
	Position = "HR Rank and File";
	ISupervisor = "San Jose, Brad";
	BasicSal = "22,500";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "55-4476527-2";
	Philhealth = "545652640232";
	Tinnumber = "888-572-294-000";
	Pagibig = "211385556888";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);
	float floatValue5=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue5,args));


	break;

		case 10006:
		


	Fname = "Rosie ";
	Lname = "Atienza";
	Birthday = "September 24, 1948";
	Address = "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte   ";
	Phonenumber = "+63-266-036-427";
	Gender = "Female";
	Position = "HR Rank and File";
	ISupervisor = "San Jose, Brad";
	BasicSal = "22,500";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "41-0644692-3";
	Philhealth = "708988234853";
	Tinnumber = "604-997-793-000";
	Pagibig = "260107732354";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue6=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue6,args));

	break;

		case 10007:
		


	Fname = "Martha";
	Lname = "Farala";
	Birthday = "January 11, 1942";
	Address = "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte    ";
	Phonenumber = "+63-329-034-366";
	Gender = "Female";
	Position = "Payroll Rank and File";
	ISupervisor = "Farala, Martha";
	BasicSal = "24, 000";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "45-5656375-0";
	Philhealth = "233693897247";
	Tinnumber = "210-835-851-000";
	Pagibig = "631130283546";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue7=142.86f;
	System.out.print(String.format("Hourly Rate:"+ floatValue7,args));

	break;

		case 10008:
		


	Fname = "Leila";
	Lname = "Martinez";
	Birthday = "July 11, 1970";
	Address = "37/46 Kulas Roads, Maragondon 0962 Quirino    ";
	Phonenumber = "+63-877-110-749";
	Gender = "Female";
	Position = "Payroll Rank and File";
	ISupervisor = "SFarala, Martha";
	BasicSal = "24,000";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "27-2090996-4";
	Philhealth = "515741057496";
	Tinnumber = "275-792-513-000";
	Pagibig = "101205445886";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue8=142.86f;
	System.out.print(String.format("Hourly Rate:"+ floatValue8,args));


	break;

		case 10009:
		


	Fname = "Allison";
	Lname = "San Jose";
	Birthday = "June 24, 1986";
	Address = "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union   ";
	Phonenumber = "+63-179-075-129";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "Mata, Christian";
	BasicSal = "22, 500";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "45-3251383-0";
	Philhealth = "745148459521";
	Tinnumber = "121-203-336-000";
	Pagibig = "114901859343";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue9=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue9,args));

	break;

		case 10010:
		


	Fname = "Cydney";
	Lname = "Rosario";
	Birthday = "October 6, 1996";
	Address = "93A/21 Berge Points, Tapaz 2180 Quezon   ";
	Phonenumber = "+63-868-819-912";
	Gender = "Female";
	Position = "HR Rank and File";
	ISupervisor = "San Jose, Brad";
	BasicSal = "22,500";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "49-1629900-2";
	Philhealth = "579253435499";
	Tinnumber = "122-244-511-000";
	Pagibig = "265104358643";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue10=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue10,args));


	break;

		case 10011:
		


	Fname = "Josie ";
	Lname = "Lopez";
	Birthday = "January 14, 1937";
	Address = "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro   ";
	Phonenumber = "+63-478-355-427";
	Gender = "Female";
	Position = "Payroll Team Leader";
	ISupervisor = "Salcedo, Anthony";
	BasicSal = "38, 475";
	RiceSub = "1, 500";
	PhoneAllow = "800";
	ClothingAllow = "800";
	SSSnumber = "44-8563448-3";
	Philhealth = "431709011012";
	Tinnumber = "218-489-737-000";
	Pagibig = "113071293354";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue11=229.02f;
	System.out.print(String.format("Hourly Rate:"+ floatValue11,args));

	break;

		case 10012:
		


	Fname = "Selena";
	Lname = "De Leon";
	Birthday = "February 20, 1945";
	Address = "89A Armstrong Trace, Compostela 7874 Maguindanao  ";
	Phonenumber = "+63-975-432-139";
	Gender = "Female";
	Position = "Account Team Leader";
	ISupervisor = "Romualdez, Fredrick";
	BasicSal = "41, 850";
	RiceSub = "1, 500";
	PhoneAllow = "800";
	ClothingAllow = "800";
	SSSnumber = "27-2090208-8";
	Philhealth = "587272469938";
	Tinnumber = "482-259-498-000";
	Pagibig = "719007608464";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue12=249.11f;
	System.out.print(String.format("Hourly Rate:"+ floatValue12,args));

	break;

		case 10013:
		


	Fname = "Fredrick";
	Lname = "Romualdez";
	Birthday = "March 10, 1985";
	Address = "22A/52 Lubowitz Meadows, Pililla 4895 Zambales";
	Phonenumber = "+63-023-079-009";
	Gender = "Male";
	Position = "Account Manager";
	ISupervisor = "Crisostomo, Jose";
	BasicSal = "63, 500";
	RiceSub = "1, 500";
	PhoneAllow = "1, 000";
	ClothingAllow = "1, 000";
	SSSnumber = "26-8768374-1";
	Philhealth = "308366860059";
	Tinnumber = "598-065-761-000";
	Pagibig = "223057707853";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue13=377.98f;
	System.out.print(String.format("Hourly Rate:"+ floatValue13,args));

	break;

		case 10014:
		


	Fname = "Mark";
	Lname = "Bautista";
	Birthday = "February 12, 1961";
	Address = "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino";
	Phonenumber = "+63-683-725-348";
	Gender = "Male";
	Position = "Account Rank and File";
	ISupervisor = "Mata, Christian";
	BasicSal = "23, 250";
	RiceSub = "1, 500";
	PhoneAllow = "500";
	ClothingAllow = "500";
	SSSnumber = "49-1647342-5";
	Philhealth = "399665157135";
	Tinnumber = "273-970-941-000";
	Pagibig = "260054585575";
	Status = "Regular";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue14=138.39f;
	System.out.print(String.format("Hourly Rate:"+ floatValue14,args));


	break;

		case 10015:
		


	Fname = "Darlene";
	Lname = "Lazaro";
	Birthday = "November 25, 1985";
	Address = "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino";
	Phonenumber = "+63-740-721-558";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "Mata, Christian";
	BasicSal = "23, 250";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "45-5617168-2";
	Philhealth = "606386917510";
	Tinnumber = "354-650-951-000";
	Pagibig = "104907708845";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue15=138.39f;
	System.out.print(String.format("Hourly Rate:"+ floatValue15,args));

	break;

		case 10016:
		


	Fname = "Kolby";
	Lname = "Delos Santos";
	Birthday = "February 26, 1980";
	Address = "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur";
	Phonenumber = "+63-739-443-033";
	Gender = "Male";
	Position = "Account Rank and File";
	ISupervisor = "San Jose, Brad";
	BasicSal = "24, 000";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "52-0109570-6";
	Philhealth = "357451271274";
	Tinnumber = "187-500-345-000";
	Pagibig = "113017988667";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue16=142.86f;
	System.out.print(String.format("Hourly Rate:"+ floatValue16,args));

	break;

		case 10017:
		


	Fname = "Vella";
	Lname = "Santos";
	Birthday = "December 31, 1983";
	Address = "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur";
	Phonenumber = "+63-955-879-269";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "Mata, Christian";
	BasicSal = "22, 500";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "52-9883524-3";
	Philhealth = "548670482885";
	Tinnumber = "101-558-994-000";
	Pagibig = "360028104576";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue17=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue17,args));

	break;

		case 10018:
		


	Fname = "Tomas";
	Lname = "Del Rosario";
	Birthday = "December 18, 1978";
	Address = "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque";
	Phonenumber = "+63-882-550-989";
	Gender = "Male";
	Position = "HR Rank and File";
	ISupervisor = "San Jose, Brad";
	BasicSal = "22,500";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "45-5866331-6";
	Philhealth = "953901539995";
	Tinnumber = "560-735-732-000";
	Pagibig = "913108649964";
	Status = "Probationary";

	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue18=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue18,args));

	break;

		case 10019:
		


	Fname = "Jacklyn ";
	Lname = "Tolentino";
	Birthday = "May 19, 1944";
	Address = "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao";
	Phonenumber = "+63-675-757-366";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "24, 000";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "47-1692793-0";
	Philhealth = "753800654114";
	Tinnumber = "841-177-857-000";
	Pagibig = "210546661243";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue19=142.86f;
	System.out.print(String.format("Hourly Rate:"+ floatValue19,args));


	break;

		case 10020:
		


	Fname = "Percival";
	Lname = "Gutierrez";
	Birthday = "December 18, 1970";
	Address = "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur ";
	Phonenumber = "+63-512-899-876";
	Gender = "Male";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "24, 750";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "40-9504657-8";
	Philhealth = "797639382265";
	Tinnumber = "502-995-671-000";
	Pagibig = "210897095686";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue20=147.32f;
	System.out.print(String.format("Hourly Rate:"+ floatValue20,args));


	break;

		case 10021:
		


	Fname = "Garfield ";
	Lname = "Manalaysay";
	Birthday = "August 28, 1966";
	Address = "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur ";
	Phonenumber = "+63-948-628-136";
	Gender = "Male";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "24, 750";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "45-3298166-4";
	Philhealth = "810909286264";
	Tinnumber = "336-676-445-000";
	Pagibig = "211274476563";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);

	float floatValue21=147.32f;
	System.out.print(String.format("Hourly Rate:"+ floatValue21,args));


	break;

		case 10022:
		


	Fname = "Lizeth ";
	Lname = "Villegas";
	Birthday = "December 12, 1981";
	Address = "66/77 Mann Views, Luisiana 1263 Dinagat Islands";
	Phonenumber = "+63-332-372-215";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "24, 000";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "40-2400719-4";
	Philhealth = "934389652994";
	Tinnumber = "210-395-397-000";
	Pagibig = "122238077997";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue22=142.86f;
	System.out.print(String.format("Hourly Rate:"+ floatValue22,args));


	break;

		case 10023:
		


	Fname = "Carol";
	Lname = "Ramos";
	Birthday = "August 20, 1978";
	Address = "72/70 Stamm Spurs, Bustos 4550 Iloilo";
	Phonenumber = "+63-250-700-389 ";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "22,500";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "60-1152206-4";
	Philhealth = "351830469744";
	Tinnumber = "395-032-717-000";
	Pagibig = "212141893454";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue23=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue23,args));


	break;

		case 10024:
		


	Fname = "Emelia";
	Lname = "Maceda";
	Birthday = "April 14, 1963";
	Address = "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija ";
	Phonenumber = "+63-973-358-041";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "22,500";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "54-1331005-0";
	Philhealth = "465087894112";
	Tinnumber = "215-973-013-000";
	Pagibig = "515012579765";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue24=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue24,args));

	break;

		case 10025:
		


	Fname = "Delia ";
	Lname = "Aguilar";
	Birthday = "January 27, 1939";
	Address = "95 Cremin Junction, Surallah 2809 Cotabato";
	Phonenumber = "+63-529-705-439";
	Gender = "Female";
	Position = "Account Rank and File";
	ISupervisor = "De Leon, Selena";
	BasicSal = "22,500";
	RiceSub = "0";
	PhoneAllow = "0";
	ClothingAllow = "0";
	SSSnumber = "52-1859253-1";
	Philhealth = "136451303068";
	Tinnumber = "599-312-588-000";
	Pagibig = "110018813465";
	Status = "Probationary";


	System.out.println("----- BASIC EMPLOYEE INFORMATION-----\n");
	System.out.println("Last Name:" + Lname);
	System.out.println("First Name:" + Fname);
	System.out.println("Date of Birth:" + Birthday);
	System.out.println("Address:" + Address);
	System.out.println("Contact Number: " + Phonenumber);
	System.out.println("Gender:" + Gender);
	System.out.println("Job Title:" + Position);
	System.out.println("Immediate Supervisor:" + ISupervisor);
	System.out.println("Date Hired:" );
	System.out.println("Basic Salary:" + BasicSal);
	System.out.println("Subsidy:" + RiceSub);
	System.out.println("Phone Allowance: " + PhoneAllow);
	System.out.println("Clothing Allowace: " + ClothingAllow);
	System.out.println("SSS Number:" + SSSnumber);
	System.out.println("Philhealth Number:" + Philhealth);
	System.out.println("Tin Number:" + Tinnumber);
	System.out.println("Pag-ibig Number:" + Pagibig);
	System.out.println("Status:" + Status);
	System.out.println("Basic Salary:" + BasicSal);


	float floatValue25=133.93f;
	System.out.print(String.format("Hourly Rate:"+ floatValue25,args));

	input. close ();

		}
	  }	
	}
	
