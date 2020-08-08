package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.utils.PropertyUtils;

public class ProfileScreen extends BaseScreen {

    public ProfileScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(profileText);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"S I G N   O U T\"]/..")
    WebElement signOutButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
    WebElement profileText;

    public void tapOnSignOutButton() {
        signOutButton.click();
        System.out.println("Tap on SignOut button");
    }
}
