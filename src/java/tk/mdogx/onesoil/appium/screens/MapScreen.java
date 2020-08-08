package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tk.mdogx.onesoil.appium.screens.widget.MenuPanelWidget;
import tk.mdogx.onesoil.appium.utils.PropertyUtils;

public class MapScreen extends BaseScreen {

    MenuPanelWidget menu;

    public MapScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        menu = new MenuPanelWidget(driver);
        this.waitUntilDisplayed(map);
    }

    @AndroidFindBy(accessibility = "Showing a Map created with Mapbox. Scroll by dragging two fingers. Zoom by pinching two fingers.")
    WebElement map;

    public MenuPanelWidget getMenu(){
        return this.menu;
    }

}
