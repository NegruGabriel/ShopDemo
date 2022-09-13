package ShopSiteTest;

import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTest extends SharedData {

    @Test
    public  void  LoginPageMethod(){

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
        String PasswordValue ="parolamare";
        PasswordElement .sendKeys(PasswordValue);

       // WebElement RegisterButton= driver.findElement(By.cssSelector([name='register']);
       // RegisterButton.click();

  }

}
