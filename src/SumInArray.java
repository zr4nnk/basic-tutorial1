
public class SumInArray {

	public static void main(String[] args) {

		int b[]= {40,50,60,70,80,90};
		int c=sumarray(b,90);
		
		if(c==90)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
static int sumarray(int b[],int x)
{
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(b[i]+b[j]==x && i!=j)
			{
				return x;
			}
		}
	}
	
	return 0;
}
}
