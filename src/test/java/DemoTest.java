import com.pages.MainPage;
import org.testng.annotations.Test;

public class DemoTest extends BasicTest {
    private final String RANDOM_SEARCH = "Last Kingdom";

    @Test
    public void verifyThatUserAreInSettingMenu() {
        MainPage mainPage = new MainPage(webDriver)
                .setSearch(RANDOM_SEARCH)
                .clickSearchButton();

    }
}
