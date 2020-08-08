package tk.mdogx.onesoil.appium.screens.onboard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.BaseScreen;

public class OnboardScreen1 extends BaseScreen {

    public OnboardScreen1(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(onboardScreenNextButton);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"NEXT\"]/..")
    WebElement onboardScreenNextButton;

    public void tapOnNextButton(){
        onboardScreenNextButton.click();
        System.out.println("Tap on Next button");
    }

}