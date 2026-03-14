
package org.testleaf.homeassignmentfeb28;
/**
 * Demonstrates primitive data types
 */
public class Google {

    public static void main(String[] args) 
    {
        // Declare and initialize variables of different primitive data types with the browser properties
        float browserVersion = 91.0f;
        String developer= "Google";
        boolean isBeta = false;
        int releaseYear = 2008;
        char shortcutKey = 'C';
        
        // Print the browser properties to the console
        System.out.println("Browser Version: "+browserVersion);
        System.out.println("Developer: "+developer);
        System.out.println("Is Beta: "+isBeta);
        System.out.println("Release Year: "+releaseYear);
        System.out.println("Shortcut Key: "+shortcutKey);
        System.out.println("Release Year of " + browserVersion + " " + developer + " is " + releaseYear);
    }
}
