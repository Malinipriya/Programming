//To sort array elements by using merge sort
//Worst Case Complexity: O(n log n)
import java.util.*;

public class MergeSort
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
	public static int[] merge(int[] A,int[] B,int[] result)
	{
		int i=0,j=0,z=0,m=A.length,n=B.length;
        while(i<m && j<n)
        {
            result[z]=Math.min(A[i],B[j]);
            if(B[j]==result[z])
            {
                ++j;
            }
            else
                ++i;
            ++z;
        }
        if(i >= m)
        {
            for(i=j;i<n;i++,z++)
                result[z]=B[i];
        }
        if(j >= n)
        {
            for(j=i;j<m;j++,z++)
                result[z]=A[j];
        }
        return result;
	}
	public static int[] mergeSort(int[] array)
	{
		if(array.length<=1)
			return array;
		int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);
        
        // Sort each half
        mergeSort(first);
        mergeSort(second);
        
        // Merge the halves together, overwriting the original array
        array=merge(first, second, array);
        return array;
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
		array=mergeSort(array);
		printList(array);
		in.close();
	}
}
