import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the month number: ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		scan.close();
		/*
		 * month = 2
		 * !(month < 1 || month > 12) = (!false && !false) = (true && true) => returns true
		 */
		if (!(month < 1 || month > 12))
		{
			String month_string = "";
			int output_days = 0;
			switch (month)
			{
				case 1: 
					month_string += "January";
					output_days += 31;
					break;
				case 2: 
					month_string += "Febuary";
					output_days += 28;
					break;
				case 3: 
					month_string += "March";
					output_days += 31;
					break;
				case 4: 
					month_string += "April";
					output_days += 30;
					break;
				case 5: 
					month_string += "May";
					output_days += 31;
					break;
				case 6: 
					month_string += "June";
					output_days += 30;
					break;
				case 7: 
					month_string += "July";
					output_days += 31;
					break;
				case 8: 
					month_string += "August";
					output_days += 31;
					break;
				case 9: 
					month_string += "September";
					output_days = 30;
					break;
				case 10: 
					month_string += "October";
					output_days = 31;
					break;
				case 11: 
					month_string += "November";
					output_days = 30;
					break;
				case 12: 
					month_string += "December";
					output_days += 31;
					break;
			}
			System.out.println(month_string + " has " + output_days + " days. ");
		}
		else
		{
			System.out.println("ERROR: Bad Input");
		}
		
	}

}
