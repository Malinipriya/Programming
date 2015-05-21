public class Solution 
{
    //The function that actually finds the subarray with the largest sum.
    public int maxCrossingSubArray(int[] nums,int low,int mid,int high)
    {
        int left_sum=Integer.MIN_VALUE,right_sum=Integer.MIN_VALUE,sum=0,i;
        for(i=mid;i>=low;i--)
        {
            sum=sum+nums[i];
            left_sum=Math.max(sum,left_sum);
        }
        sum=0;
        for(i=mid+1;i<=high;i++)
        {
            sum=sum+nums[i];
            right_sum=Math.max(sum,right_sum);
        }
        return left_sum+right_sum;
    }
    //The recursive function that does the divide and conquer part.
    public int maxSubArray(int[] nums,int low,int high)
    {
        if(low==high)
            return nums[low];
        int mid=(low+high)/2;
        return Math.max(Math.max(maxSubArray(nums,low,mid),maxSubArray(nums,mid+1,high)),maxCrossingSubArray(nums,low,mid,high));
    }
    public int maxSubArray(int[] nums) 
    {
        int low=0;
        int high=nums.length-1;
        return maxSubArray(nums,low,high);
    }
}