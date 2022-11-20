package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Privacy & Legal Component.
 *
 * @author am.garcia
 */
public class PrivacyAndLegalComponent extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PrivacyAndLegalComponent(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator =
            "new UiSelector().resourceIdMatches(\".*privacy_and_legal_elements\").resourceIdMatches(\".*txt_element\")")
    private List<AndroidElement> privacyLegalElements;

    /**
     * return true if Privacy & Legal Elements are displayed in screen, otherwise false.
     *
     * @author am.garcia
     */
    public boolean privacyLegalElementsAreDisplayed() {

        AtomicInteger truthyValue = new AtomicInteger();

        privacyLegalElements.forEach(element -> {

            if (!element.getText().equalsIgnoreCase("")) {
                truthyValue.addAndGet(1);
            }
        });

        return truthyValue.get() == 10;
    }
}
