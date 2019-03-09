package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.product.CustomProductPage;

import java.util.ArrayList;
import java.util.List;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

/**
 * @autor Marcelo Garay
 */
public class AdidasHomePage extends BasePage {
    @FindBy(xpath = "//a[contains(text(), 'HOMBRE')]")
    private WebElement hombreLink;

    @FindBy(xpath = "//a[contains(text(), 'HOMBRE')]/parent::div/descendant::div[contains(normalize-space(@class), 'flyout navigation-gender-men hover')]")
    private WebElement hombreNewOptions;

    @FindBy(xpath = "//input[@data-auto-id='searchinput']")
    private WebElement searchBar;

    private final static String ALL_ELEMENTS_HOMBRE_BY_SUBSECTION = "//div[@class='headline']/a[contains(text(),'%s')]/parent::div/following-sibling::ul//a[contains(@href, 'hombre')]";

    public AdidasHomePage clickOverHombreHeader() {
        hoverWebElement(hombreLink);
        return this;
    }

    public boolean isHombreNewOptionsPresent() {
        return isPresent(hombreNewOptions);
    }

    public List<String> getAllElementsByNammeSubsection(String nameSubSection) {
        List<WebElement> webElements = findWebElements(String.format(ALL_ELEMENTS_HOMBRE_BY_SUBSECTION, nameSubSection));
        List<String> allElementsValue = new ArrayList<>();
        for (WebElement webElement : webElements) {
            allElementsValue.add(getTextContent(webElement));
        }
        return allElementsValue;
    }

    public CustomProductPage lookFor(String lookForData) {
        setInputDateField(searchBar, lookForData);
        pressEnterKey(searchBar);
        return new CustomProductPage();
    }

    public AdidasHomePage focusSearchBarField() {
        hoverWebElement(searchBar);
        return this;
    }
}
