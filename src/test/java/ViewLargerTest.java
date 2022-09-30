import base.TestBase;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.menu.TopMenuPage;
import pages.product.ProductGridPage;
import pages.product.ProductPage;
import pages.product.ProductPopUpPage;

public class ViewLargerTest extends TestBase {

    @Test
    public void viewLargerTestWithSuccess(){
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        ProductGridPage productGridPage = new ProductGridPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ProductPopUpPage productPopUpPage = new ProductPopUpPage(driver);

        topMenuPage.moveMouseOverWomenBtn()
                .waitToBlousesBtnVisible()
                .clickOnBlousesBtn();

        productGridPage.waitToProductsCatNameVisible();

        productPage.moveOverProductImage()
                .waitToQuickViewBtnVisible()
                .clickOnQuickViewBtn();

        productPopUpPage.waitToPopUpVisible();
        productPopUpPage.switchToIframe();

        for(int i=0;i<productPopUpPage.getThumbsImageListSize();i++){
            productPopUpPage.moveOnProductThumb(i);
            Assertions.assertThat(productPopUpPage.isThisThumbIsDisplayed(i)).isEqualTo(true);
        }

    }

}
