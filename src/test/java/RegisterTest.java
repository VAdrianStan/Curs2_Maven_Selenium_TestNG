import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest {

    @Test
    public void createNewAccountTest(){
        // instantiem un nou driver
        WebDriver driver = new ChromeDriver();
        // setam fereastra browserului in full screen
        driver.manage().window().maximize();
        //navigam pe URL-ul dorit
        driver.get("https://tutorialsninja.com/demo/");
        // click pe My Account Button
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        // click pe Register
        driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();

        // valideaza titlul paginii
        String expectedTitle = "Register Account";
        String actualTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Register Account')]")).getText();
        Assert.assertEquals(actualTitle, expectedTitle, "The page title is not correct");

        //completam cu date valide
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Ciulama");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Patrunjel");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(TestData.generateNewEmail());
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("+40722662662");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123@abc");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("123@abc");

        // dau click pe radio button - yes
        driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();

        // bifez checkBox-ul de privacy
        driver.findElement(By.xpath("//input[@name='agree']")).click();

        // apas pe butonul continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        // validez ca am ajuns la mesajul cu succes
        String expectedSuccesMessage = "Your Account Has Been Created!";
        String actualSuccesMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Your Account')]")).getText();
        Assert.assertEquals(actualSuccesMessage, expectedSuccesMessage, "nu prea se pupa");

        // dau click pe butonul continue
        driver.findElement(By.xpath("//a[contains(text(), 'Continue')]")).click();


        //Tema: Test log in in care isi pune user si parola si intrat pe unul din produse si se adauga in cos

        // addToCartTest si atat - locatori doar xpath













    }
}
