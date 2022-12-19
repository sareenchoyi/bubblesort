package bubble;

public class BubbleSorter 
{
	private int[]		a;
	private long		nVisits;
	private long		nSwaps;
	
	
	public BubbleSorter(int[] a)
	{
		this.a = a; 
	}
	
	
	public void sort()
	{
		nVisits = 0;
		nSwaps = 0;
		int temp; 
		boolean swapped = false; 

		for(int i = 0; i <a.length ; i++) {
			swapped = false;
            for(int j = 0; j < a.length - 2; j--) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true; 
					
					
				}
				if(swapped == false) {
					break;
					
					
				}
				
				
			}
			
			
		}
		
	}
	
	
	public String toString()
	{
		String s = nVisits + " visits, " + nSwaps + " swaps\n{";
		for (int n: a)
			s += " " + n;
		s += " }";
		return s;
	}
	
	public long getNVisits()
	{
		return nVisits;
	}
	
	
	public long getNSwaps()
	{
		return nSwaps;
	}
	
	
	public int[] getArray()
	{
		return a;
	}
	
	
	
}
