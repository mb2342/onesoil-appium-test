package tk.mdogx.onesoil.appium.screens.onboard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.BaseScreen;

public class OnboardScreen3Usertype extends BaseScreen {

    public OnboardScreen3Usertype(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(agronomistItem);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"NEXT\"]/..")
    WebElement nextButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"an agronomist\"]/..")
    WebElement agronomistItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"a landowner\"]/..")
    WebElement landownerItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"a consultant\"]/..")
    WebElement consultantItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"a student\"]/..")
    WebElement studentItem;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"other\"]/..")
    WebElement otherItem;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter your role...\"]")
    WebElement otherItemEditText;

    public void tapOnOtherItem() {
        otherItem.click();
        System.out.println("Tap on Other button");
    }

    public void enterOtherValue(String text) {
        this.tapOnOtherItem();
        otherItemEditText.sendKeys(text + "\n");
        System.out.println("Enter \"" + text + "\" to Other text field");
    }

    public void tapOnNextButton() {
        nextButton.click();
        System.out.println("Tap on Next button");
    }

}