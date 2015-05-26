//To sort array elements by using bubble sort
//Worst Case Complexity: O(n^2)
import java.util.*;

public class BubbleSort
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
	public static void bubbleSort(int[] array)
	{
		int i,n=array.length;
		while(n>=0)
		{
			for(i=0;i<array.length-1;i++)
			{
				if(array[i]>array[i+1])
					swap(i,i+1,array);
			}
			printList(array);
			n--;
		}
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
		bubbleSort(array);
		in.close();
	}
}
