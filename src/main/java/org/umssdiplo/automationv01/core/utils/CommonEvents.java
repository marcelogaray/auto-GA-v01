package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.util.List;

public class CommonEvents {

    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * This method set date content to web element.
     * Format: DD/MM/YYYY
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */

    public static void setInputDateField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(content);
    }

    /**
     * This method set select value by text to web element.
     *
     * @param webElement  Is select web element.
     * @param visibleText Is the visible select text that will be set to the web element.
     */
    public static void setSelectFieldByText(WebElement webElement, String visibleText) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        Select select = new Select(webElement);
        select.selectByVisibleText(visibleText);
    }

    /**
     * This method wait for alert is visible.
     *
     */
    public static void waitForAlertVisible() {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent());
    }

    /**
     * This method perform a click action in alert accept button
     *
     */
    public static void clickAlertAcceptButton() {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent());
        Alert alert = ManageDriver.getInstance().getWebDriver().switchTo().alert();
        alert.accept();
    }

    public static void setDateField(WebElement webElement, String content) {
        if (null != content && content.length() == 8) {
            ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
            webElement.sendKeys(content);
        } else {
            setInputField(webElement, content);
        }
    }

    /**
     * This method choose an option from web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void selectOptionFieldByValue(WebElement webElement, String content) {
        try {
            Select selectWebElement = new Select(webElement);
            ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(selectWebElement.getOptions()));
            selectWebElement.selectByValue(content);
        } catch (NoSuchElementException e) {
            System.out.println("content do not exits.");
        }
    }

    /*
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    /**
     * This method return the text content of an alert.
     *
     * @return the text content of the Alert.
     */
    public static String getTextFromWindowsAlert(){
        try {
            return ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent()).getText();
        }catch (Exception e){
            return null;
        }
    }

    public static void clickOKInWindowsAlert(){
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent()).accept();
    }

}
