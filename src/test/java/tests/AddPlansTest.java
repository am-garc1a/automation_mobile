package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import screens.AddPlansScreen;
import screens.DashBoardScreen;
import util.reporter.Reporter;
import util.tests.BaseMobileTest;

public class AddPlansTest extends BaseMobileTest {
    @Description(value = "Add plans screen test")
    @Test(priority = 3)
    public void navigateToPrivacyAndLegal() {
        Reporter.info("TEST START, add plans screen---------------");

        Reporter.info("Start Navigation to Add Plans Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        AddPlansScreen addPlans = dashBoard.goToAddPlansScreen();

        Reporter.info("TEST FINISH, add plans screen---------------");
    }
}
