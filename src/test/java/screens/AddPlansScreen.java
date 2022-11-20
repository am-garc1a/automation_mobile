package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.List;

public class AddPlansScreen extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public AddPlansScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator =
            "new UiSelector().resourceIdMatches(\".*actionSheetListView\").resourceIdMatches(\".*actionSheetItemText\")")
    private List<AndroidElement> plansList;

    /**
     * @param planToFind : plan to find
     * @return string after evaluate if the input received coincide with any category.
     * @author am.garcia
     */
    public String planIsPresent(String planToFind) {
        return elementIsPresentInList(plansList, planToFind);
    }

}
