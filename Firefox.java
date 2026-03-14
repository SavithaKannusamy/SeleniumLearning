package org.testleaf.week1.day1;
/**
 * Demonstrates primitive data types
 */
public class Firefox {

    public static void main(String[] args) 
    {
        // Declare and initialize variables of different primitive data types with the browser properties
        float browserVersion = 100.2f;
        String browserName = "firefox";
        boolean isVisible = true;
        short releaseYear = 1998;
        char browserLogo = 'f';
        // Print the browser properties to the console
        System.out.println("Browser Version: "+browserVersion);
        System.out.println("Browser Name: "+browserName);
        System.out.println("Visibility : "+isVisible);
        System.out.println("Release Year: "+releaseYear);
        System.out.println("Browser Logo: "+browserLogo);
        System.out.println("Release Year of "+browserVersion+" "+browserName+" is "+releaseYear);
    }
}
