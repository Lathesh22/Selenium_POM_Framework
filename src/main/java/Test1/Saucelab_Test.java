package Test1;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base1.OpenBrowser;
import Page1.Saucelab_Page;
import utils.Excel_Utils;


public class Saucelab_Test extends OpenBrowser {

    Saucelab_Page saucePage;

    @BeforeMethod
    public void openApp() {
        driver.get("https://www.saucedemo.com");
        saucePage = new Saucelab_Page(driver);
    }

    // existing valid login test
    @Test
    public void valid() {
        saucePage.enterusernmae("standard_user");
        saucePage.enterpasswortd("secret_sauce");
        saucePage.enterbutton();
        Assert.assertTrue(
            driver.getTitle().contains("Swag Labs"),
            "Valid login failed!");
        System.out.println("Valid login passed!");
    }

    // existing invalid login test
    @Test
    public void invalid() {
        saucePage.enterusernmae("standard_user");
        saucePage.enterpasswortd("wrongpass");
        saucePage.enterbutton();
        String error = saucePage.getErrorMessage();
        Assert.assertTrue(
            error.contains("Epic sadface"),
            "Invalid login failed!");
        System.out.println("Invalid login passed!");
    }

    // data provider reads from Excel
    
    @DataProvider(name = "loginData")
    public Object[][] getData() throws Exception {
        return Excel_Utils.getTestData(
            System.getProperty("user.dir") +
            "/TestData/testing.xlsx",
            "Sheet1");
    }

    // data driven test
    @Test(dataProvider = "loginData")
    public void dataDriverLogin(String username,
                                String password,
                                String expected) {
        saucePage.enterusernmae(username);
        saucePage.enterpasswortd(password);
        saucePage.enterbutton();

        if (expected.equals("valid")) {
            Assert.assertTrue(
                driver.getTitle().contains("Swag Labs"),
                "Valid login failed for: " + username);
            System.out.println("PASS - valid: " + username);
        } else {
            String error = saucePage.getErrorMessage();
            Assert.assertTrue(
                error.contains("Epic sadface"),
                "Invalid login failed for: " + username);
            System.out.println("PASS - invalid: " + username);
        }
    }
}