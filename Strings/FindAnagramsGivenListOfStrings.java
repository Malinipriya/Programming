public class Solution 
{
    public ArrayList<String> anagrams(String[] strs) 
    {
        ArrayList<String> result=new ArrayList<String>();
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        int i;
        String sorted;
        for(i=0;i<strs.length;i++)
        {
            char[] charArray=strs[i].toCharArray();
            Arrays.sort(charArray);
            sorted=new String(charArray);
            if(hash.containsKey(sorted))
            {
                if(hash.get(sorted)!=-1)
                {
                    result.add(strs[hash.get(sorted)]);
                    hash.put(sorted,-1);
                }
                result.add(strs[i]);
            }
            else
            {
                hash.put(sorted,i);
            }
        }
        return result;
    }
}