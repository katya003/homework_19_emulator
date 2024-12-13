package tests;

import components.ContinueButtonComponent;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.FirstScreen;
import screens.FourthScreen;
import screens.SecondScreen;
import screens.ThirdScreen;

@Tag("local")
public class LocalWikiTest extends TestBase {

    private final ContinueButtonComponent continueButtonComponent = new ContinueButtonComponent();
    private final FirstScreen firstScreen = new FirstScreen();
    private final SecondScreen secondScreen = new SecondScreen();
    private final ThirdScreen thirdScreen = new ThirdScreen();
    private final FourthScreen fourthScreen = new FourthScreen();

    @Test
    void onBoardingPagesTest() {
        firstScreen.checkTextLanguages();
        continueButtonComponent.clickContinueButton();
        secondScreen.checkNewExplore();
        continueButtonComponent.clickContinueButton();
        thirdScreen.checkReadingLists();
        continueButtonComponent.clickContinueButton();
        fourthScreen.checkData();
    }
}
