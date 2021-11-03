import com.pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasicTest {
    private final String EMAIL = "bohdan.potochnyak@gmail.com";
    private final String PASSWORD = "2WzCBvrd+7&KpAy";
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
        webDriver.get("https://www.imdb.com/?ref_=nv_home");

        new LogInPage(webDriver)
                .clickSignInMainMenuButton()
                .clickSignInWithIMDbButton()
                .setEmail(EMAIL)
                .setPassword(PASSWORD)
                .clickSignInButton();
    }

    @AfterClass
    public void closeUp() {
        webDriver.close();
        webDriver.quit();
    }
}
