package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        String baseUrl = "https://demo.nopcommerce.com/";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        // maximize the window
        driver.manage().window().maximize();
        // We give implicit wait to driver
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

