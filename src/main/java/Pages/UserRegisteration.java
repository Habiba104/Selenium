package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegisteration extends PageBase
{
    public UserRegisteration(WebDriver driver) {
        super(driver);

    }

    @FindBy(id="gender-male")
    WebElement genderRadioBtn;
    @FindBy(id="FirstName")
    WebElement firstTxt;
    @FindBy(id="LastName")
    WebElement lastTxt;
    @FindBy(id="Email")
    WebElement emailTxt;
    @FindBy(id="Password")
    WebElement password;
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(id="register-button")
    WebElement registerBtn;
    @FindBy(className = "result")
   public WebElement successMessage;  //by default it is private ha3mel 3aleeha assert fe file tany

  public void userRegistration(String firstName,String lastName, String email,String pass){
//    genderRadioBtn.click();
    clickButton(genderRadioBtn);
    //firstTxt.sendKeys("firstName");
   // lastTxt.sendKeys("lastName");
   // emailTxt.sendKeys("email");
    sendKeys(firstTxt,firstName);
    sendKeys(lastTxt,lastName);
    sendKeys(emailTxt,email);
    sendKeys(password,pass);
    sendKeys(confirmPassword,pass);
   // registerBtn.click();
    clickButton(registerBtn);
}


}
