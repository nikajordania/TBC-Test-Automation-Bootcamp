import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestTask {

    @Test
    public void openUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Open site URL
        driver.get("http://the-internet.herokuapp.com/");

//        Searching for an element in DOM, clicking on it, entering data(Mail) into the input line and Submit it.
        driver.findElement(By.xpath("//*[@href ='/forgot_password']")).click();
//        Or we can use xpath copied in browser: //*[@id="content"]/ul/li[20]/a
        driver.findElement(By.name("email")).sendKeys("nika.zhordania@test.com");
        driver.findElement(By.id("form_submit")).submit();

//        Wait 5 seconds and then close the browser
        Thread.sleep(5000);
        driver.quit();
    }

}
