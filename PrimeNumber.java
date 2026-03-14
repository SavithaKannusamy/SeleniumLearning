package org.testleaf.homeassignmentmar01;

/** Checks if a number is prime or not */

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int n = 3;
        if((n % 2 == 0) && (n > 1))
        {
          if((n % 3 == 0)) 
          {
            if((n % 5 == 0)) 
            {
                if((n % 7 == 0))
                {
                    System.out.println("The number is not prime");
                }
                else
                {
                    System.out.println("The number is prime");
                }
                
            }
           
          }
        
        }
    }
}       
