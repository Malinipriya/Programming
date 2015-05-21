public class Solution 
{
    //Finds a candidate for the majority element using Moore's voting algorithm.
    public int findMajority(int[] nums)
    {
        int count=1,majority_index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[majority_index])
                count++;
            else    
                count--;
            if(count==0)
            {
                majority_index=i;
                count=1;
            }
        }
        return nums[majority_index];
    }
    //Check if the candidate given is a majority element.
    //If candidate occurs more than n/2 times in the array, true is returned. Otherwise false.
    public boolean isMajority(int[] nums,int candidate)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==candidate)
                count++;
        }
        if(count>Math.floor(nums.length/2))
            return true;
        return false;
    }
    //Does two processes.
    //1. Find a candidate for majority element.
    //2. Check if the candidate found is a majority element.
    public int majorityElement(int[] nums) 
    {
        int candidate=findMajority(nums);
        if(isMajority(nums,candidate))
            return candidate;
        return 0;
    }
}