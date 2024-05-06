package Tests;

import Pages.HomePage;
import Pages.MyAccount;
import Pages.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase {
    HomePage homeObject;
    UserRegisteration registerObject;
    MyAccount accountObject;

    @Test()
    public void successfulRegisteration() {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();

        registerObject = new UserRegisteration(driver);
        registerObject.userRegistration("Sara", "Hassan", "terasureeo@gmail.com", "123456");

        Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration "));
    }
    @Test()
    public void userCanChangePassword()
    {
        accountObject=new MyAccount(driver);
        accountObject.openMyAccountPage();
        accountObject.openChangePasswordPage();
        accountObject.ChangePassword("123456","12345678");
        Assert.assertTrue(accountObject.resultLabel.getText().contains("Password was changed"));

    }
}