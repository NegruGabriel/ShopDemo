package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    public WebDriver driver;

    @BeforeMethod
    public void InitializedDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.manage().window().maximize();
    }
}
