package org.testleaf.homeassignmentmar14;

//** Find Duplicate Elements in an Array */
import java.util.Arrays;

public class PrintDuplicates {

    public static void main(String[] args)
    {
            // Declare and initialize an array of integers with some duplicate values
            int[] num = {2,5,7,7,5,9,2,3};

            //sort the array to bring duplicate elements together
            Arrays.sort(num);

            System.out.println("Duplicate numbers in the array are: ");
            for(int i=0; i<num.length; i++)
            {
                for(int j=i+1; j<num.length; j++)
                {
                    if(num[i] == num[j])
                    {
                        System.out.println(num[j]);
                    }
                }

            }

    }
}
