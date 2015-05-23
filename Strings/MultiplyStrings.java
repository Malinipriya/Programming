//Given two numbers represented as strings, return multiplication of the numbers as a string.
//Note: The numbers can be arbitrarily large and are non-negative.
import java.math.BigInteger;
public class Solution 
{
    public String multiply(String num1, String num2) 
    {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger n3=n1.multiply(n2);
        String s=n3.toString();
        return s;
    }
}