import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {

    String user = "ciulamaDePatrunjel7507@gmail.com";
    String pass = "123@abc";

    @Test
    public void logInTest() throws InterruptedException {

        // instantiem un nou driver
        WebDriver driver = new ChromeDriver();
        // setam fereastra browserului in full screen
        driver.manage().window().maximize();
        //navigam pe URL-ul dorit
        driver.get("https://tutorialsninja.com/demo/");
        // click pe My Account Button
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        // click pe Login
        driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
        // valideaza titlul paginii
        String expectedResults = "Returning Customer";
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).getText();
        Assert.assertEquals(actualResult, expectedResults, "We are not on the right page!");

        // Input credentials
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);

        // click login button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(1000);
        // click home button
//         driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();





    }
}
