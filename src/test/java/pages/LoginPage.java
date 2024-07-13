package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Generic;

public class LoginPage extends BasePage{


    public LoginPage(AndroidDriver driver) {
        super(driver);
    }


//    @iOSXCUITFindBy(xpath="")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"PROCEED\" and @enabled='false']")
    WebElement proceedButtonDisabled;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"PROCEED\" and @enabled='true']")
    WebElement proceedButtonDEnabled;

    @AndroidFindBy(xpath = "//android.app.Dialog/android.view.View/android.widget.EditText\n")
    WebElement mobileTextField;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Close\")")
    WebElement closeButton;


    public void verifyLogin(){
        Generic.verifyButtonIsEnabled(loginButton);
    }

    public void verifyLoginScreen(){
        loginButton.click();
        Generic.verifyButtonIsDisabled(proceedButtonDisabled);
        mobileTextField.sendKeys("8931234562");
        Generic.verifyButtonIsEnabled(proceedButtonDEnabled);
        closeButton.click();
    }


}
