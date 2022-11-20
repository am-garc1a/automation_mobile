package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*android:id/button2\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*dismiss-icon\")")
    private AndroidElement dismissWelcome;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator =
            "new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Map\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Map\")")
    private AndroidElement mapButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator =
            "new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"More\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"More\")")
    private AndroidElement moreOptionsButton;

    /**
     * Navigate to Map Screen from DashBoard Screen.
     *
     * @author Hans.Marquez
     */
    public MapScreen goToMapScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)) {
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)) {
            click(dismissPreferenceUpdateButton);
        }
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * Navigate to More Options Screen from DashBoard Screen.
     *
     * @author am.garcia
     */
    public MoreOptionsScreen goToMoreOptionsScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)) {
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)) {
            click(dismissPreferenceUpdateButton);
        }
        click(moreOptionsButton);
        return new MoreOptionsScreen(driver);
    }

}
