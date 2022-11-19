package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class CategoryListComponent extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public CategoryListComponent(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categorySelectHeader\")")
    private AndroidElement selectCategoryTitle;


    // new UiSelector().className("android.widget.LinearLayout")

    public boolean selectCategoryTitleIsDisplayed() {
        return isElementAvailable(selectCategoryTitle);
    }
}
