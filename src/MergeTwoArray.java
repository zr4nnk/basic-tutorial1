
public class MergeTwoArray {

	public static void main(String[] args) {

		int a[]= {10,20,30};
		int b[]= {40,50,60,70,80,90};
		int c[]=merge(a,b);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
static int[] merge(int a[],int[] b)
{
	int c[]=new int[a.length+b.length];
	
	for(int i=0;i<c.length;i++)
	{
		if(i<a.length)
		{
			c[i]=a[i];
		}
		else
		{
			c[i]=b[i-a.length];
		}
	}

	
	return c;
}
}
