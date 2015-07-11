/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element.
You may assume no duplicate exists in the array.
*/
public class Solution 
{
    public int findMin(int[] num) 
    {
        if(num.length==1)
            return num[0];
        if(num.length==2)
            return Math.min(num[0],num[1]);
        int i=0,j=1,flag=0;
        //The array is sorted in a rotated fashion.
        //We've found the minimum element when the first element is greater than the second when comparing two consecutive elements.
        while(j<=num.length-1)
        {
            if(num[i]>num[j])
            {
                flag=1;
                break;
            }
            i++;
            j++;
        }
        if(flag==1)
            return num[j];
        return num[0];
    }
}