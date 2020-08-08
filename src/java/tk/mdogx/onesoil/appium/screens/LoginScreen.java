package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.utils.PropertyUtils;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(mailEditText);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter password\"]")
    WebElement passwordEditText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter email address\"]")
    WebElement mailEditText;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[@text=\"Sign in\"]")
    WebElement signInButton;

    public void enterValidCredentials() {
        mailEditText.sendKeys(PropertyUtils.getProperty("valid.login.email"));
        passwordEditText.sendKeys(PropertyUtils.getProperty("valid.login.password"));
        System.out.println("Enter valid credentials");
    }

    public void tapOnSignInButton() {
        signInButton.click();
        System.out.println("Tap on SignIn button");
    }
}
