package org.testleaf.week1.day2;
/**
 * Finds and prints odd numbers from 1 to 10
 */
public class FindOddNumbers {

    public static void main(String[] args) 
    {
        // Declare a variable 'a' to represent the upper limit of the range
        int a = 10;
        System.out.println("Odd numbers from 1 to "+a);
        for (int i = 1; i <= a; i++) 
        {
            if (i % 2 == 1) 
            {
                // Print the odd number to the console
                System.out.println(i);
            }
        }
    }
}
        
    

