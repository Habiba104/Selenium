package Tests;

import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase { //all t/c will inherit from it
    public static WebDriver driver;

    @BeforeSuite
    //@Parameters{{"browser "}}
    public void startDriver() {
        //@optional ("chrome")String browserName
        // if(browserName.equalsIgnoreCase("chrome")) {
        //take line 19
        // }
        //  else if ( browserName.equalsIgnoreCase("firefox"))

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @AfterSuite
    public void stopDriver() {
        driver.quit();

    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result) //interface shayla el result
    {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            Helper.captureScreenshot(driver, result.getTestName()); //nadet el helper 3alatoll heya static
        }
    }
}