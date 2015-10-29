import java.util.Random;

public class RandomNumber
{

	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	public int GetANumber(int high)
	{
		Random rand = new Random();
		return rand.nextInt(high + 1);
	}
	
	public int GetANumber(int lo, int hi)
	{
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}
	
}