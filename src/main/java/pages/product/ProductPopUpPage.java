package pages.product;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basic.BasePage;

import java.util.List;
@Slf4j
public class ProductPopUpPage extends BasePage {

    public ProductPopUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#thumbs_list a")
    private List<WebElement> thumbsImageList;

    @FindBy(css = ".fancybox-overlay .fancybox-iframe")
    private WebElement productPopUpIframe;


    public void moveOnProductThumb(int i){
        moveMouseOver(thumbsImageList.get(i));
    }

    public boolean isThisThumbIsDisplayed(int i){
        return thumbsImageList.get(i).getAttribute("class").contains("fancybox shown");
    }

    public void waitToPopUpVisible(){
        waitToBeVisible(productPopUpIframe);
    }

    public int getThumbsImageListSize(){
        return thumbsImageList.size();
    }

    public void switchToIframe(){
        driver.switchTo().frame(productPopUpIframe);
    }


}
