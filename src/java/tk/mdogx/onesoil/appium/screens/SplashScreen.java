package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(onboardScreenLogoImage);
    }

    @AndroidFindBy(accessibility = "OneSoil logo")
    WebElement onboardScreenLogoImage;

    public void tapOnLogoImage(){
        onboardScreenLogoImage.click();
        System.out.println("Tap on Logo image on Splash screen");
    }

}
