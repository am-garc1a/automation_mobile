package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CategoryListComponent;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class NavigationTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen Navigation test")
    @Test()
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter is not displayed");

        log.info("Validate Categories Button");
        Assert.assertTrue(map.categoriesIsDisplayed(), "Categories is not displayed");

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List is not displayed");
    }

    @Description(value = "Categories list test")
    @Test()
    public void navigateToCategoriesList() {
        log.info("Precondition -> Navigate to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();
        CategoryListComponent categoryList = map.clickCategoryListComponent();

        log.info("Validate Categories Title");
        Assert.assertTrue(categoryList.selectCategoryTitleIsDisplayed(), "Categories List is not displayed");
    }

}
