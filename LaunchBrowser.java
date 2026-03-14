package org.testleaf.week2.day1;
/**
 * Demonstrates opening a browser and navigating to a URL using Selenium WebDriver
 */

// Import the Dimension class from the Selenium WebDriver library to set the browser window size
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args)
    {
    // Create an instance of ChromeDriver to open a Chrome browser
    ChromeDriver driver = new ChromeDriver ();
    driver.get("http://leaftaps.com/opentaps/control/login");

    // Maximize the browser window
    driver.manage().window().maximize();

    // Set the browser window size to 500x600 pixels
    Dimension size = new Dimension(500, 600);
    driver.manage().window().setSize(size);
    }    
}
