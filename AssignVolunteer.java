// Chapter 5 Java Exercise

import java.util.Scanner;

public class AssignVolunteer
{
	public static void main(String[] args)
	{
		// Variables and constants
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

		// Input phase
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " + OTHER_CODE + " for ANYTHING ELSE >> ");

		donationType = input.nextInt();

		// Processing phase

		if(donationType == CLOTHING_CODE)
		{
			volunteer = CLOTHING_PRICER;
			message = "a clothing donation";
		}
		else if (donationType == OTHER_CODE)
		{
			volunteer = OTHER_PRICER;
			message = "a non-clothing donation";
		}

		else
		{
			volunteer = "invalid";
			message = "not a valid type of donation";
		}

		// Output phase
		System.out.println("You entered: " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is: " + volunteer);

	}

}