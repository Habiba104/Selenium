package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPge extends PageBase {
    public ProductDetailsPge(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="strong.ui-id-2")
    public WebElement productNameInNextPage;
}
