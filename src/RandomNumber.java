import java.util.Random;

public class RandomNumber
{
	private int lo, hi;
	
	public void SetLowNumber(int low)
	{
		lo = low;
	}
	
	public void SetHighNumber(int high)
	{
		hi = high;
	}
	
	public int GetANumber()
	{	
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}
	
	/*public int GetANumber(int high)
	{
		Random rand = new Random();
		return rand.nextInt(high + 1);
	}
	
	public int GetANumber(int lo, int hi)
	{
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}**/
	
}