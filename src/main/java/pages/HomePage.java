package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        driver.findElement(By.linkText("Dropdown")).click();
        return new DropdownPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
