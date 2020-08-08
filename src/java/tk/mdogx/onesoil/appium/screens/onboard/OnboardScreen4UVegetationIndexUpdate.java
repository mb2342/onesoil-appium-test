package tk.mdogx.onesoil.appium.screens.onboard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.BaseScreen;

public class OnboardScreen4UVegetationIndexUpdate extends BaseScreen {

    public OnboardScreen4UVegetationIndexUpdate(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(enableNotificationButton);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ENABLE NOTIFICATIONS\"]/..")
    WebElement enableNotificationButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Not now\"]/..")
    WebElement notNowButton;

    public void tapOnEnableNotificationButton() {
        notNowButton.click();
        System.out.println("Tap on Enable Notification button");
    }

    public void tapOnNotNowButton() {
        notNowButton.click();
        System.out.println("Tap on Not now button");
    }

}