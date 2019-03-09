package org.umssdiplo.automationv01.core.managepage.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;
/**
 * @autor Marcelo Garay
 */
public class CustomProductPage extends BasePage {

    @FindBy(xpath = "//div[contains(@data-auto-id, 'size-selector')]/descendant::button")
    private WebElement selectOfTallas;

    @FindBy(xpath = "//button[text()='Añadir al carrito' and @type='submit']")
    private WebElement addToCar;

    @FindBy(xpath = "//span[contains(@data-auto-id, 'add-to-bag-product-info-size')]")
    private WebElement sizeProductDisplayedPopup;

    private static final String SIZE_DYNAMIC = "//button[contains(text(), '%s')]";
    private static final String TITLE_PRODUCT = "//h1[contains(text(), '%s')]";
    private static final String TITLE_MESSAGE = "//h5[contains(text(), '%s')]";
    private static final String PRICE_PRODUCT_DISPLAYED_CUSTOM_PRODUCT = "//h1[contains(text(), '%s')]/parent::div//span[@class='gl-price__value']";
    private static final String PRICE_PRODUCT_DISPLAYED_POPUP = "//h5[contains(text(), '%s')]/parent::div//span[@class='gl-price__value']";

    public CustomProductPage(){
        waitToPageCompleted();
    }

    public boolean isProductTitleDisplayed(String productTitle) {
        noUseThisWait(3000);
        return isDynamicElementDisplayed(String.format(TITLE_PRODUCT, productTitle));
    }

    public CustomProductPage expandListOfTallas() {
        clickButton(selectOfTallas);
        return this;
    }

    public CustomProductPage selectSize(String sizeDynamic) {
        clickButton(String.format(SIZE_DYNAMIC, sizeDynamic));
        return this;
    }

    public CustomProductPage clickAddToCar() {
        clickButton(addToCar);
        noUseThisWait(3000);
        return this;
    }

    public boolean isTitleMessageDisplayed(String titleMessage) {
        return isDynamicElementDisplayed(String.format(TITLE_MESSAGE, titleMessage));
    }

    public String getSizeDisplayedOnPopup() {
        return getTextContent(sizeProductDisplayedPopup).replace("Talla: ", "");
    }

    public String getPriceDisplayedOnCustomProduct(String productTitle) {
        return getTextContent(String.format(PRICE_PRODUCT_DISPLAYED_CUSTOM_PRODUCT, productTitle));
    }

    public String getPriceDisplayedOnPopup(String productTitle) {
        return getTextContent(String.format(PRICE_PRODUCT_DISPLAYED_POPUP, productTitle));
    }
}
