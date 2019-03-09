package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.home.AdidasHomePage;
import org.umssdiplo.automationv01.core.managepage.product.CustomProductPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.managefiles.HandleJsonFile;

import java.util.List;

/**
 * @autor Marcelo Garay
 */
public class BuyingThroughCarsStepdefs {
    private AdidasHomePage adidasHomePage;
    private CustomProductPage customProductPage;
    private HandleJsonFile dataExpected = HandleJsonFile.getInstance();
    private String priceActual;

    @Given("^the Adidas web side is loaded$")
    public void theAdidasWebSideIsLoaded() throws Throwable {
        adidasHomePage = LoadPage.AddidasHomePage();
    }

    @And("^click over “Hombre” option on 'Header' section$")
    public void clickOverHombreOptionOnHeaderSection() throws Throwable {
        adidasHomePage.clickOverHombreHeader();
    }

    @Then("^verify that new options sections is present on 'Header' section as popup$")
    public void verifyThatNewOptionsSectionsIsPresentOnHeaderSectionAsPopup() throws Throwable {
        Assert.assertTrue(adidasHomePage.isHombreNewOptionsPresent());
    }

    @And("^verity that the list of elements on the subsection \"([^\"]*)\" are displayed on popup$")
    public void verityThatTheListOfElementsOnTheSubsectionAreDisplayedOnPopup(String nameSubSection) throws Throwable {
        List<String> allElementsByNameSubsectionActual = adidasHomePage.getAllElementsByNammeSubsection(nameSubSection);
        List<String> allElementsByNameSubsectionExpected = dataExpected.getAllElementsByNammeSubsection(nameSubSection);

        Assert.assertEquals(allElementsByNameSubsectionActual, allElementsByNameSubsectionExpected);
    }

    @And("^click over 'Search Bar' field on 'Header' section as popup$")
    public void clickOverSearchBarFieldOnHeaderSectionAsPopup() throws Throwable {
        adidasHomePage.focusSearchBarField();
    }

    @And("^look for \"([^\"]*)\" search bar field on 'Header' section as popup$")
    public void lookForSearchBarFieldOnHeaderSectionAsPopup(String lookForData) throws Throwable {
        customProductPage = adidasHomePage.lookFor(lookForData);
    }

    @Then("^the \"([^\"]*)\" title is displayed on 'Custom Product' page$")
    public void theTitleIsDisplayedOnCustomProductPage(String productTitle) throws Throwable {
        boolean isProductTitleDisplayed = customProductPage.isProductTitleDisplayed(productTitle);
        Assert.assertTrue(isProductTitleDisplayed, "Title product: ".concat(productTitle).concat(" is not displayed."));
    }

    @And("^expand list of 'Tallas' on 'Custom Product' page$")
    public void expandListOfTallasOnCustomProductPage() throws Throwable {
        customProductPage.expandListOfTallas();
    }

    @And("^select \"([^\"]*)\" on 'Custom Product' page$")
    public void selectOnCustomProductPage(String sizeProduct) throws Throwable {
        customProductPage.selectSize(sizeProduct);
    }

    @And("^click 'Add to Car' button on 'Custom Product' page$")
    public void clickAddToCarButtonOnCustomProductPage() throws Throwable {
        customProductPage.clickAddToCar();
    }

    @Then("^verify the \"([^\"]*)\" title message should be displayed on 'Custom Product' page as popup$")
    public void verifyTheTitleMessageShouldBeDisplayedOnCustomProductPageAsPopup(String titleMessage) throws Throwable {
        boolean isTitleMessageDisplayed = customProductPage.isTitleMessageDisplayed(titleMessage);
        Assert.assertTrue(isTitleMessageDisplayed);
    }

    @And("^verify the \"([^\"]*)\" is according to selected on 'Custom Product' page$")
    public void verifyTheIsAccordingToSelectedOnCustomProductPage(String sizeProductExpected) throws Throwable {
        String sizeDisplayedActual = customProductPage.getSizeDisplayedOnPopup();

        Assert.assertEquals(sizeDisplayedActual, sizeProductExpected, "Size actual and expected are not equals.");
    }

    @When("^getting the 'Price' of \"([^\"]*)\" displayed on 'Custom Product' page$")
    public void gettingThePriceOfDisplayedOnCustomProductPage(String productTitle) throws Throwable {
        priceActual = customProductPage.getPriceDisplayedOnCustomProduct(productTitle);
    }

    @And("^verity that the Price of \"([^\"]*)\" on the main page should match with the price on the pop up$")
    public void verityThatThePriceOfOnTheMainPageShouldMatchWithThePriceOnThePopUp(String productTitle) throws Throwable {
        String pricePopup = customProductPage.getPriceDisplayedOnPopup(productTitle);
    }
}
