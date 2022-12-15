
public class MergeInZigZag {

	public static void main(String[] args) {

		int a[]= {10,30,50,70,90,110,130,150,170};
		int b[]= {20,40,60,80,100,120,140};
		int c[]=mergeZigzag(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
static int[] mergeZigzag(int a[],int b[])
{
	int c[]=new int[a.length+b.length];
	int i=0;
	int j=0;
	int k=0;
	
	while(i<c.length)
	{
		if(j<a.length)
		{
		c[i]=a[j];
		i++;
		j++;
		}
		
		if(k<b.length)
		{
		c[i]=b[k];
		i++;
		k++;
		}
	}
return c;	
}
}
