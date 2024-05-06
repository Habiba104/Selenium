package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPge extends PageBase{
    public SearchPge(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="small-searchterms")
    WebElement searchBarTxt;
    @FindBy(css="button.button-1.search-box-button")
    WebElement searchBTn;
    @FindBy(id="ui-id-2")
    WebElement ProductList;
    @FindBy(css="h2.product-title")
    WebElement productTitle;

    public void searchForProduct(String productName)
    {
     sendKeys(searchBarTxt,productName);
     clickButton(searchBTn);

    }

    public void openProductDetailspage()
    {
    clickButton(productTitle);
    }
}
