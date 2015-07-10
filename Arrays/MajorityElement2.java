/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
The algorithm should run in linear time and in O(1) space.
*/
public class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> l=new ArrayList<Integer>();
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int i,count;
        int check=nums.length/3;
        //Add every element and its frequency in the array to a hashmap.
        for(i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                count=h.get(nums[i]);
                count++;
                h.put(nums[i],count);
            }
            else
                h.put(nums[i],1);
        }
        //Iterate through the hashmap to find the elements that occur more than n/3 times. 
        //Insert the elements found into an arraylist.
        for(Integer key : h.keySet()) 
        {
            if(h.get(key) > check)
                l.add(key);
        }
        return l;
    }
}