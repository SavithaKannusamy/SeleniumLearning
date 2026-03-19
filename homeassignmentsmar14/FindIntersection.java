package org.testleaf.week3.homeassignmentsmar14;

//** Find the intersection of two arrays */
public class FindIntersection 
{
    public static void main(String[] args) 
    {
        //Initializing the two arrays
        int a[] = {3,2,11,4,6,7};
        int b[] = {1,2,8,4,9,7};

        //Finding the length of the arrays
        int l1=a.length;
        int l2=b.length;

        //Print the intersection of the two arrays
        System.out.print("The intersection is ");

        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }    
}



