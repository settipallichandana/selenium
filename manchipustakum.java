import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manchipustakum {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ts-chandana.s/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://manchipustakam.in/");
        driver.manage().window().maximize();


        driver.findElement(By.id("firstName")).sendKeys("Chandana");
    }
}
