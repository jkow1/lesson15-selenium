package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basic.BasePage;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#block_top_menu a[title='Women']")
    private WebElement womenMenuBtn;

    @FindBy(css = ".submenu-container a[title='Blouses']")
    private WebElement blousesSubCatBtn;

    public TopMenuPage moveMouseOverWomenBtn() {
        moveMouseOver(womenMenuBtn);
        return this;
    }

    public TopMenuPage waitToBlousesBtnVisible() {
        waitToBeVisible(blousesSubCatBtn);
        return this;
    }

    public TopMenuPage clickOnBlousesBtn() {
        clickOnBtn(blousesSubCatBtn);
        return this;
    }

}
