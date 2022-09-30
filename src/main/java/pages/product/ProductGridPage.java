package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basic.BasePage;

import java.util.List;

public class ProductGridPage extends BasePage {

    public ProductGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product_list .product-container")
    private List<WebElement> productsListGrid;

    @FindBy(css = ".center_column .cat-name")
    private WebElement productsCatName;

    public ProductGridPage waitToProductsCatNameVisible() {
        waitToBeVisible(productsCatName);
        return this;
    }

}
