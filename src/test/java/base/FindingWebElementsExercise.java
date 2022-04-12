package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingWebElementsExercise {

    private WebDriver driver;

    public void countElements(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + links.size());

        driver.quit();
    }

    public static void main(String[] args) {

        FindingWebElementsExercise test = new FindingWebElementsExercise();
        test.countElements();
    }
}
