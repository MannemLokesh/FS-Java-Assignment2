public class SelectionSort 
{  
    static void selection(int a[]) 
    {  
	    int i, j, small;  
	    int n = a.length;  
	    for (i = 0; i < n-1; i++)  
	    {  
	        small = i;  
	        for (j = i+1; j < n; j++) 
	        {
		        if (a[j] < a[small])  
		        {
		            small = j;  
		        }
	        }  
	    int temp = a[small];  
	    a[small] = a[i];  
	    a[i] = temp;  
	    }  
  
    }  
	static void printArr(int a[]) 
	{  
	    int i;  
	    int n = a.length;  
	    for (i = 0; i < n; i++)  
	    {
	    	System.out.print(a[i] + " ");  
	    }
	}  
  
    public static void main(String[] args) 
    {  
	    int a[] = { 229, 91, 49, 4,-4, 0, 19, 10, 235, 21 };  
	    System.out.println("Before sorting array");  
	    printArr(a);  
	    selection(a);  
	    System.out.println("\nAfter sorting array");  
	    printArr(a);  
	    System.out.println();  
    }  
}  