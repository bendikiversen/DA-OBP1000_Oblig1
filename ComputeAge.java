import java.util.Scanner; //Import Scanner for user input functionality
import java.util.Calendar; //Import Calendar to retrieve current year from system

/*
This application calculates the age of a person based on provided birth year subtracted with current system year.
a. If the integer birthYear is set to value 0, the application ends
b. If the integer birthYear is higher than currentYear, the user gets an error message
c. If the integer is less than currentYear but higher than 0, the program calculates the persons age.
*/

public class ComputeAge
{
	public static void main(String[] args)
	{
		//Defining Scanner input and variables
		Scanner input = new Scanner(System.in);
		int birthYear;
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int personAge;
		String result = "";

		System.out.println("This program calculates the age of a person,\nbased on provided birth year subtracted with current system year.\n");

		do
		{
			System.out.print("Enter the persons birth year (0 to stop application): ");
			birthYear = input.nextInt();

			if(birthYear == 0)
				result = "Application end.";

			else if(birthYear > currentYear)
				result = "Birth year higher than current year!\n";

			else if(birthYear <= currentYear && birthYear > 0)
			{
				personAge = currentYear-birthYear;
				result = "A person with birth year "+birthYear+" is or will be "+personAge+" y/o this year.\n";
			}
			else
			{
				result = "The birth year is negative.\n";
			}

			System.out.println(result);

		} while(birthYear !=0); //While loop continues to run program unless the given input is 0
	}
}
