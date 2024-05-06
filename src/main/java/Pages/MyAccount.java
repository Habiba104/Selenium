package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase
{
    public MyAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "My account")
    WebElement myAccountLink;

    @FindBy(linkText  ="Change password")
    WebElement changePasswordLink;
    @FindBy(id="OldPassword")
    WebElement oldPasswordTxt;
    @FindBy(id="NewPassword")
    WebElement newPasswordTxt;
    @FindBy(id="ConfirmNewPassword")
    WebElement confirmPasswordTxt;
    @FindBy(css="input.button-1.change-password-button")
    WebElement changePasswordBtn;
    @FindBy(css="p.content")
    public WebElement resultLabel;

    public void openMyAccountPage()
    {
        clickButton(myAccountLink);
    }
    public void openChangePasswordPage()
    {
       clickButton(changePasswordLink);
    }

    public void ChangePassword(String oldpassword ,String newpassword)
    {
        sendKeys(oldPasswordTxt,oldpassword);
        sendKeys(newPasswordTxt,newpassword);
        sendKeys(confirmPasswordTxt,newpassword);
        clickButton(changePasswordBtn);
    }
}

