package tk.mdogx.onesoil.appium.screens.onboard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.BaseScreen;

public class OnboardScreen5AddFirstField extends BaseScreen {

    public OnboardScreen5AddFirstField(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(addAFieldButton);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ADD A FIELD\"]/..")
    WebElement addAFieldButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"I've already signed up. Sign in\"]/..")
    WebElement SignInButton;

    public void tapOnAddAFieldButton() {
        addAFieldButton.click();
        System.out.println("Tap on Add a Field button");
    }

    public void tapOnSignInButton() {
        SignInButton.click();
        System.out.println("Tap on Sign In button");
    }

}