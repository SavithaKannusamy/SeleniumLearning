package org.testleaf.week3.homeassignmentsmar14;

import java.util.Arrays;

//** Find the missing element in an array */
public class FindMissingElement 
{

    public static void main(String[] args) 
    {
        //Initializing the array with 7 elements instead of 8
        int a[] = {1,4,3,2,6,7,8};
        //Sorting the array
        Arrays.sort(a);

        //Print the missing element
        for(int i=0,j=1;i<a.length;i++,j++){
            if(a[i]!=j)
            {
                System.out.println("The missing element is "+j);
                break;
            }
        }
    }

}
