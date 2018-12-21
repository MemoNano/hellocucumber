package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * This was a default Selenium test to help build out and break up the required steps for Cucumber BDD
 */
public class SeleniumTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver

        driver = new ChromeDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String signInLink = ".//div[contains(@class, 'ph-hr-welcome')]//a[@data-analytics-action='Sign In']";
        String emailInput = ".//input[@id='email_signIn']";
        String passwordInput = "password_signIn";
        String signInSubmitButton = ".//button[@id='ph-login']";
        String signOutButton = ".//a/span[text()='(sign out)']";

        //Launch the Pizza Hut
        driver.get("http://www.pizzahut.com/index.php");
        // Click Sign In
        driver.findElement(By.xpath(signInLink)).click();

        // Enter Email
        driver.findElement(By.xpath(emailInput)).sendKeys("malexander123@mailinator.com");

        // Enter Password
        driver.findElement(By.id(passwordInput)).sendKeys("chicago1");
        // Now submit the form. WebDriver will find the form for us from the element
        driver.findElement(By.xpath(signInSubmitButton)).click();
        // Print a Log In message to the screen
        System.out.println("Login Successfully");

        // Click Sign Out
        driver.findElement(By.xpath(signOutButton)).click();
        // Print a Log In message to the screen
        System.out.println("LogOut Successfully");

        // Close the driver
        driver.quit();

    }

}