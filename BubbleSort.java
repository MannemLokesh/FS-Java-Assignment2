public class BubbleSort
{
	public static void main(String[] args) 
	{
		int a[]= {229,204,119,305,206,339};
		System.out.println("Before Sorting Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}	
		//to sort array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a.length-i-1;j++)
			{
				//to swap
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter Sorting Array");
		//to print array
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}	
	}
}