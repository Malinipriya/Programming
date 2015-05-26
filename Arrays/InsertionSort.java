//To sort array elements by using insertion sort
//Worst Case Complexity: O(n^2)
import java.util.*;

public class InsertionSort
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
	public static void insertionSort(int[] array)
	{
		int i,j,key;
		for(j=1;j<array.length;j++)
		{
			i=j-1;
			key=array[j];
			while((i>-1) && (array[i]>key))
			{
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
			printList(array);
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
		insertionSort(array);
		in.close();
	}
}