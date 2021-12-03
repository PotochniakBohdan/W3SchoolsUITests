package BasicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BasicTest {
//    private final String EMAIL = "bohdan.potochnyak@gmail.com";
//    private final String PASSWORD = "wU#*2N*2A:sd/hM";
    private final String EMAIL = "bohdan.potochniak@gmail.com";
    private final String PASSWORD = "M28v2S!iYd?hGPH";
    protected static WebDriver webDriver;

    @BeforeClass
    public void setUpClass() {
        String WebDriverPath = System.getenv("WebDrivers");
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            WebDriverPath += "\\chromedriver.exe";
        } else {
            WebDriverPath += "/chromedriver";
        }

        System.setProperty("webdriver.chrome.driver", WebDriverPath);

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.get("https://www.w3schools.com/");

//        new LogInPage(webDriver)
//                .clickLogInMainMenuButton()
//                .setEmail(EMAIL)
//                .setPassword(PASSWORD)
//                .clickSignInButton();
    }
}
