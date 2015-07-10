/*
Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
*/
public class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        //Insert every element and its index in the hashmap.
        //If a key already exists in the hashmap, it means that the element has already occured in the array.
        //Retrieve its previous index location. 
        //Check if the difference between the previous and the current index is atmost k. If so, return true.
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                int j=h.get(nums[i]);
                if(i-j<=k)
                    return true;
                h.put(nums[i],i);
            }
            else
                h.put(nums[i],i);
        }
        return false;
    }
}
