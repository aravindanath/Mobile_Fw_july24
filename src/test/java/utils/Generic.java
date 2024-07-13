package utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Generic {


    public static void verifyButtonIsEnabled(WebElement element){
        Assert.assertTrue(element.isEnabled(),"Button is disabled");
    }


    public static void verifyButtonIsDisabled(WebElement element){
        Assert.assertFalse(element.isEnabled(),"Button is Enabled");
    }
}
