package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NopCommerce_Chrome {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the Url in the browser
        driver.get(baseUrl);
        // Maximize the window
        driver.manage().window().maximize();
        // Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
         String title = driver.getTitle();
         // printing statement
        System.out.println(title);

        //Get the current Url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
       // Click on login link element
        loginLink.click();

        // Find email field Element
       WebElement emailField = driver.findElement(By.id("Email"));
       emailField.sendKeys("ishita@gmail.com");

       //Find password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Ishita123");

        // close the browser
        driver.close();



    }

}
