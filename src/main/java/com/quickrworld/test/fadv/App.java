package com.quickrworld.test.fadv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Selenium Testing
 *
 */
public class App {
    public static void main( String[] args ) {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amitabh\\jenkins\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https:www.google.com";
        String expectedTitle = "Google";
        String actualTitle;
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println("actualTitle:" + actualTitle);
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
