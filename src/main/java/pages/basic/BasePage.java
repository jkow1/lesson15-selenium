package pages.basic;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class BasePage {

    protected WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(System.getProperty("webElementTimeOut"))));
        actions = new Actions(driver);
    }

    public BasePage(WebDriver driver, WebElement element) {
        new BasePage(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
    }

    public void clickOnBtn(WebElement element) {
        log.info("Clicking on {}", element.getText());
        element.click();
    }

    public void moveMouseOver(WebElement element) {
        log.info("Moving mouse over {}", element.getText());
        actions.moveToElement(element).perform();
    }

    public void waitToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
