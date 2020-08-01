package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class OnboardScreen extends BaseScreen {

    public OnboardScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "OneSoil logo")
    AndroidElement onboardScreenLogo;

    public void waitForSplashScreenToBeNotPresent(){
        waitUtils.waitForElementToBeNotPresent(By.xpath("//android.widget.ImageView[@content-desc=\"OneSoil logo\"]"), driver);
    }

}