package testScripts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"DemoDevice");
//        caps.setCapability("udid","emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.illionsoft.thyrocare.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.illionsoft.thyrocare");
//        caps.setCapability("noReset","true");
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
}
