package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Email")
    WebElement emailTxtlogin;
    @FindBy(linkText = "Password")
    WebElement passTxtlogin;
    @FindBy( css = "input.button-1.login-button")
    WebElement loginBtn;
    @FindBy(linkText = "Log out")
     public WebElement logoutBtn;

    public void userLogin(String email ,String password)
    {
        sendKeys(emailTxtlogin,email);
        sendKeys(passTxtlogin,password);
        clickButton(loginBtn);
    }
    public  void  userLogout()
    {
    clickButton(logoutBtn);
    }

}
