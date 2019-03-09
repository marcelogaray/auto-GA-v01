package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.io.PrintWriter;
import java.io.StringWriter;
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
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param xpath web element container at the list
     * @return the List of WebElements that is searching.
     */
    public static List<WebElement> findWebElements(String xpath) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ManageDriver.getInstance().getWebDriver().findElement(By.xpath(xpath))));
        return ManageDriver.getInstance().getWebDriver().findElements(By.xpath(xpath));
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
     * Force to wait a time in millisecond, try not to use it.
     *
     * @param timeMilliSeconds timeout in milliseconds to generate a loop
     */
    public static void noUseThisWait(int timeMilliSeconds) {
        try {
            Thread.sleep(timeMilliSeconds);
        } catch (InterruptedException e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
        }
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

    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click action in a web element dynamic by xpath.
     *
     * @param xpath Is the web element that will be pressed.
     */
    public static void clickButton(String xpath) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ManageDriver.getInstance().getWebDriver().findElement(By.xpath(xpath))));
        ManageDriver.getInstance().getWebDriver().findElement(By.xpath(xpath)).click();
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
    public static boolean isWebElementDisplayed(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * Getting dynamic elements if it is displayed, using xpath locators dynamic
     * it should have the keys works: %s, it will means the dynamic value
     *
     * @param xpath  with dynamic value which locates elements via XPath
     * @return true when element is displayed by UI, otherwise false
     */
    public static boolean isDynamicElementDisplayed(String xpath) {
        try {
            return ManageDriver.getInstance().getWebDriver().findElement(By.xpath(xpath)).isDisplayed();
        } catch (NoSuchElementException e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            return false;
        }
    }

    public static void waitToPageCompleted(){
        ManageDriver.getInstance().getWebDriverWait().until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver()).executeScript("return document.readyState").equals("complete");
            }
        });
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
     * This method return the text content of a xpath as string.
     *
     * @param xpath is the WebElement as XPATH to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(String xpath) {
        return ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(ManageDriver.getInstance().getWebDriver().findElement(By.xpath(xpath)))).getText();
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

    public static boolean isTextPresent(String text){
        return ManageDriver.getInstance().getWebDriver().getPageSource().contains(text);
    }

    /**
     * Hover WebElement using a wait
     *
     * @param webElement is the WebElement to extract the text.
     */
    public static void hoverWebElement(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        Actions action = new Actions(ManageDriver.getInstance().getWebDriver());
        action.moveToElement(webElement).build().perform();
    }
}
