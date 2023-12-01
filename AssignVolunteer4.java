// Chapter 5 exercise nested if statements

import java.util.Scanner;

public class AssignVolunteer4
{
	public static void main(String[] args)
	{
		// Variables and constants
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;

		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

		// Input phase
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " +  FURNITURE_CODE + " for FURNITURE," +  ELECTRONICS_CODE + " for ELECTRONICS," + OTHER_CODE + " for ANYTHING ELSE >> ");

		donationType = input.nextInt();

		// Processing phase
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
		System.out.println("You entered " + donationType + " which is NOT a valid donation type");
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " +  FURNITURE_CODE + " for FURNITURE, " +  ELECTRONICS_CODE + " for ELECTRONICS, " + OTHER_CODE + " for ANYTHING ELSE >> ");
		donationType = input.nextInt();
		} // End of while loop.


		switch(donationType)
		{
			case(CLOTHING_CODE):
			{
				volunteer = CLOTHING_PRICER;
				message = "A clothing donation";
				break;
			}	
			case(FURNITURE_CODE):
			{
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE):
			{
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			}
			case(OTHER_CODE):
			{
				volunteer = OTHER_PRICER;
				message = "anoter donation type";
				break;
			}

			default:
			{
				volunteer = "invalid";
				message = "an invalid donation type";
			}

		}
	
		// Output phase
		System.out.println("You entered: " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is: " + volunteer);

	}

}
