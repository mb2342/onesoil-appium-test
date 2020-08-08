package tk.mdogx.onesoil.appium.screens.widget;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.BaseScreen;

public class MenuPanelWidget extends BaseScreen {

    public MenuPanelWidget(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.waitUntilDisplayed(menuPanelFieldButton);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Fields\"]/..")
    WebElement menuPanelFieldButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Notes\"]/..")
    WebElement menuPanelNotesButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Insights\"]/..")
    WebElement menuPanelInsightsButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]/..")
    WebElement menuPanelProfileButton;

    public void tapOnFieldButton() {
        menuPanelFieldButton.click();
        System.out.println("Tap on Field button on Menu");
    }

    public void tapOnNotesButton() {
        menuPanelNotesButton.click();
        System.out.println("Tap on Notes button on Menu");
    }

    public void tapOnInsightsButton() {
        menuPanelInsightsButton.click();
        System.out.println("Tap on Insights button on Menu");
    }

    public void tapOnProfileButton() {
        menuPanelProfileButton.click();
        System.out.println("Tap on Profile button on Menu");
    }
}
