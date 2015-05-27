//To sort array elements by using quick sort
//Worst Case Complexity: O(n^2)
import java.util.*;

public class QuickSort
{
	public static void printList(int[] array)
	{
		System.out.println("The sorted list:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n");
	}
	public static void swap(int a,int b,int[] array)
	{
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	public static void quickSort(int[] array,int low,int high)
	{
		int i=low,j=high,pivot=array[low+(high-low)/2];
		while(i<=j)
		{
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j)
			{
				swap(i,j,array);
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(array,low,j);
		if(i<high)
			quickSort(array,i,high);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the # of array elements");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),i;
		int[] array=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
			array[i]=in.nextInt();
		quickSort(array,0,array.length-1);
		printList(array);
		in.close();
	}
}
