
public class Freq {

	public static void main(String[] args) {

		int a[]= {12,32,42,12,42,32,17,18,20,19,14,20,19,18,13,14,12};
//		int b=freq(a,30);
//		System.out.println("Found "+b+" times");
	
		freqElement(a);
	}
//	static int freq(int a[], int ele)
//	{
//		int c=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==ele)
//			{
//				c++;
//			}
//		}	
//		return c;
//	}
	
	static void freqElement(int a[])
	{
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
			
		}
		
		int c[]=new int[big+1];
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					c[a[i]]++;
				}
			}
		}
		
		
		for(int i=0;i<c.length;i++)
		{
			if(i==a[i])
			System.out.println(i+" "+c[i]+" Times");
		}
		
	}
	
	
}
