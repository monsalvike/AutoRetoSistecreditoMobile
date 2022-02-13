package dafiti.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverOwn {
    private static AndroidDriver driver;

    public static AndroidDriver init(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("deviceName","d7a728ec");
        desiredCapabilities.setCapability("appActivity",".activity.SplashSelectCountry_");
        desiredCapabilities.setCapability("appPackage","br.com.dafiti");
        desiredCapabilities.setCapability("noReset","true");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                    desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

}
