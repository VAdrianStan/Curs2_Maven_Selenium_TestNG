import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void goToWebsiteTest() {

        WebDriver driver = new ChromeDriver();
        driver.get(TestData.URL);
    }
}
