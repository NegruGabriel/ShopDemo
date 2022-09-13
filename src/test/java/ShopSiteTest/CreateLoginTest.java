package ShopSiteTest;

import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLoginTest extends SharedData {

    @Test
    public  void  CreateLoginMethod(){

        WebElement DismissLink = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
        DismissLink.click();

       WebElement MyAccountTab = driver.findElement(By.xpath("//a[text()='My Account']"));
       MyAccountTab.click();

        WebElement UserNameElement = driver.findElement(By.cssSelector("input[id='reg_username']"));
        String UserNameValue ="WarioLupin";
        UserNameElement.sendKeys(UserNameValue);

        WebElement EmailAddressElement = driver.findElement(By.cssSelector("input[id='reg_email']"));
        String  EmailAddressValue ="vash@yahoo.co";
        EmailAddressElement .sendKeys( EmailAddressValue);

        WebElement PasswordElement = driver.findElement(By.cssSelector("input[id='reg_password']"));
        String PasswordValue ="parolamarePAROLAMARE@123456";
        PasswordElement .sendKeys(PasswordValue);

        WebElement RegisterButton= driver.findElement(By.cssSelector("button[name='register']"));
       RegisterButton.click();

        driver.navigate().to("https://shop.demoqa.com/shop-demoqa?redirect_to=https%3A%2F%2Fshop.demoqa.com%3A443%2Fmy-account%2F&aiowps_login_msg_id=session_expired\n");

       WebElement EmailAddressAccountElement = driver.findElement(By.id("user_login"));
        String  EmailAddressAccountValue ="vash@yahoo.co";
        EmailAddressAccountElement.sendKeys( EmailAddressAccountValue);

        WebElement PasswordAccountElement = driver.findElement(By.id("user_pass"));
        String PasswordAccountValue ="parolamarePAROLAMARE@123456";
        PasswordAccountElement.sendKeys(PasswordAccountValue);



  }

}
