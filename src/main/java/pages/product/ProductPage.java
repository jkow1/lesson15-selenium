package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basic.BasePage;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    private List<WebElement> allProductsList;

    @FindBy(css = ".quick-view")
    private WebElement quickViewBtn;

    @FindBy(css = ".product_img_link")
    private WebElement productImage;

    public ProductPage moveOverProductImage(){
        moveMouseOver(productImage);
        return this;
    }

    public ProductPage waitToQuickViewBtnVisible(){
        waitToBeVisible(quickViewBtn);
        return this;
    }

    public ProductPage clickOnQuickViewBtn(){
        clickOnBtn(quickViewBtn);
        return this;
    }


}
