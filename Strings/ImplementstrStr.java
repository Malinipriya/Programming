public class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        //If both strings are empty, it means needle is part of haystack.
        if(haystack.length()==0 && needle.length()==0)    
            return 0;
        //If needle is empty, it means needle is part of haystack.
        else if(needle.length()==0)
            return 0;
        //If haystack is empty or the length of haystack is less than that of needle, it means needle is not part of haystack.
        else if(haystack.length()==0 || haystack.length()<needle.length())
            return -1;
        //If needle is the exact same string as haystack, it means needle is part of haystack.
        else if(haystack.compareTo(needle)==0)
            return 0;
        int i,j=0,index=-1,flag=0;
        for(i=0;i<haystack.length();i++)
        {
            //Checks if every character of needle is a part of the haystack.
            if(haystack.charAt(i)==needle.charAt(j))
            {
                if(j==0)
                    index=i;
                j++;
                flag=1;
                if(j<needle.length())
                    continue;
            }
            //The following condition tests and makes sure that needle is part of the haystack.And returns the required index.
            if(j>=needle.length())
                return index;
            if(flag==1)
                i=index;
            flag=0;
            j=0;
        }
        return -1;
    }
}