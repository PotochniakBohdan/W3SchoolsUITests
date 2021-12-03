package LoginForm;

import BasicTests.BasicTest;
import com.elements.LabelElement;
import com.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFormTests extends BasicTest {
    private final String INCORRECT_EMAIL = "bohdan.potochnyak";
    private final String INCORRECT_PASSWORD = "wU#*2N*2A:sd/hM";

    private final String EMAIL = "bohdan.potochnyak@gmail.com";
    private final String PASSWORD = "wU#*2N*2A:sd/hM";

    @BeforeMethod
    public void openingLogInForm() {
        new LogInPage(webDriver)
                .clickLogInMainMenuButton();
    }

    @Test
    public void verifyThatTickElementIsActive() {
        LogInPage verifyLoginFormWithIncorrectData = new LogInPage(webDriver)
                .setEmail(EMAIL)
                .setPassword(PASSWORD);

            Assert.assertFalse(verifyLoginFormWithIncorrectData.isTickElementActive());
    }

    @Test
    public void verifyThatUserAreInSettingMenu() {
        LabelElement verifyLoginFormWithIncorrectData = new LogInPage(webDriver)
                .setEmail(EMAIL)
                .setPassword(PASSWORD)
                .clickSignInButton()
                .getUserNameAfterLogIn();

        String expectedTextTitleLabel = "Bohdan Potochnyak";
        Assert.assertEquals(verifyLoginFormWithIncorrectData.getText(), expectedTextTitleLabel);
    }

//    @Test
//    public void verifyThatUserCantLogInWithIncorrectData() {
//        LogInPage verifyLoginFormWithIncorrectData = new LogInPage(webDriver)
//                .setEmail(INCORRECT_EMAIL)
//                .setPassword(INCORRECT_PASSWORD)
//                .clickSignInButton();
//    }

    @AfterMethod
    public void finishUpTests() {
        BasicTest.webDriver.close();
    }
}
