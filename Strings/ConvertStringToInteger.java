//Implement atoi to convert a string to an integer.
public class Solution 
{
    public int myAtoi(String str) 
    {
        if(str.length()==0)
            return 0;
        str=str.trim();
        int i=0;
        double result=0;
        //set flag to be positive or negative by reading the first character of the string.
        //The flag indicates if the integer is going to be positive or negative.
        char flag='+';
        if(str.charAt(i)=='-')
        {
            i++;
            flag='-';
        }
        else if(str.charAt(i)=='+')
        {
            i++;
        }
        //Go through the string and change every character to an integer if it happens to be a numeric one.
        while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9')
        {
            result=result*10+(str.charAt(i)-'0');
            i++;    
        }
        //Finally append the flag to the result and return the correct integer.
        if(flag=='-')
            result=-result;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)result;
    }
}