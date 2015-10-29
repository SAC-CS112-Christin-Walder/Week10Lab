import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class GuessANumber
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		RandomNumber rand = new RandomNumber();

		int[] aryOdd = new int[10];
		int[] aryEven = new int[10];
		int[] aryRandNum = new int[10];
		int[] aryResult = new int[10];
		
		System.out.printf("What is the highest possible random number (positive)?: ");
		int high = input.nextInt();
		rand.SetHighNumber(high);
		
		System.out.printf("What is the lowest possible random number (positive)?: ");
		int low = input.nextInt();
		rand.SetLowNumber(low);
		
		for (int i = 0; i < 10; i++)
		{
			aryRandNum[i] = rand.GetANumber();
			int remainder = aryRandNum[i] % 2;

			System.out.printf("Round %d: Will the number be odd or even?: ", i+1);
			String guess = input.next();
			guess = guess.toUpperCase();
			
			if ((!guess.equals("ODD")) && (!guess.equals("EVEN")))
			{
				System.out.print("Invalid input.");
			}

			if (guess.equals("ODD"))
			{
				aryOdd[i] = 1;
				aryEven[i] = 0;
			} else
			{
				aryOdd[i] = 0;
				aryEven[i] = 1;
			}

			if (((guess.equals("ODD") && (remainder == 1)) || ((guess.equals("EVEN") && (remainder == 0)))))
			{
				aryResult[i] = 1;
				if (aryOdd[i] == 1)
					System.out.printf("The number is %d\nYou guessed ODD - you are correct.\n\n", aryRandNum[i]);
				else
					System.out.printf("The number is %d\nYou guessed EVEN - you are correct.\n\n", aryRandNum[i]);
			} else
			{
				aryResult[i] = 0;
				if (aryOdd[i] == 1)
					System.out.printf("The number is %d\nYou guessed ODD - you are incorrect.\n\n", aryRandNum[i]);
				else
					System.out.printf("The number is %d\nYou guessed EVEN - you are incorrect.\n\n", aryRandNum[i]);
			}
		}
	}

}