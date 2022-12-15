
public class InsertInArray {

	public static void main(String[] args) {

		int a[]= {10,30,50,70,90,110,130,150,170};
		int ele=2000;
		int c[]=insertAt(a,ele,1);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

	static int[] insertAt(int a[],int ele,int index)
	{
		int z[]=new int[a.length+1];
		z[index]=ele;
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				z[i]=a[i];
			}
			else
			{
				z[i+1]=a[i];
			}
		}
		
		
		return z;
	}
}
