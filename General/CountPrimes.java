//Count the number of prime numbers less than a non-negative number, n.
public class Solution 
{
    public int countPrimes(int n) 
    {
        if(n==0 || n==1)
            return 0;
        //Use Sieve of Erastothenes algorithm to count the prime numbers.
        boolean[] primes=new boolean[n];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        int i,j,count=0;
        //If a number is prime, we make all its multiples composite.
        //This is achieved by setting the values of the multiples equal to false in the 'primes' array.
        for(i=2;i<primes.length;i++)
        {
            if(primes[i])
            {
                count++;
                for(j=2;i*j<primes.length;j++)
                {
                    primes[i*j]=false;
                }
            }
        }
        return count;
    }
}