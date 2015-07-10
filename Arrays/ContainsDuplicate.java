/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/
public class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        //Add every element as a key to a hashmap.
        //If a key already exists in the map while adding elements, then it means that the array contains a duplicate.
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
                return true;
            else
                h.put(nums[i],i);
        }
        return false;
    }
}