package testScripts;

import org.testng.annotations.Test;
import pages.LoginPage;

public class TC_001 extends  BaseTest{


    @Test
    public void tc001(){

        LoginPage lp = new LoginPage(driver);
        lp.verifyLogin();
        lp.verifyLoginScreen();
    }
}
