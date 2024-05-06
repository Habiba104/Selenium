package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase

{   HomePage homeObject;
    UserRegisteration registerObject;
    LoginPage loginObject;
    @Test(priority=1)
    public void successfulRegisteration()
    {
        homeObject= new HomePage(driver);
        homeObject.openRegistrationPage();

        registerObject=new UserRegisteration(driver);
        registerObject.userRegistration("Sara","Hassan","temmzallo@gmail.com","123456");

        Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration "));
    }
  @Test (dependsOnMethods = {"Logout"})
    public void userCanLogin()
  {
      homeObject.openLoginPage(); //click on login page
      loginObject=new LoginPage(driver);
      loginObject.userLogin("temmzallo@gmail.com","123456");
      Assert.assertTrue(loginObject.logoutBtn.getText().contains("Log out"));

  }
 @Test(dependsOnMethods = {"successfulRegisteration"})
    public void Logout()
 {
     loginObject=new LoginPage(driver);
     loginObject.userLogout();
 }

}
