package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class BasePage {

    protected AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
        PageFactory.initElements(new AppiumFieldDecorator(this.driver, ofSeconds(30)),this);
    }



}
