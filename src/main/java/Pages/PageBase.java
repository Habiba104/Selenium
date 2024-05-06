package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
     protected WebDriver driver ;
    //create constructor (parameterized)
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);  //me7tag meenak webdrver w me7tag page so
                                                     //i gave webdriver to constructor still object (this)
    }
 protected static void clickButton(WebElement button)
 {
     button.click();
 }
protected static void sendKeys(WebElement textElement, String value)
{
   textElement.sendKeys(value);
}

}
