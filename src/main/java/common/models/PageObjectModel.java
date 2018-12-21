package common.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: This should probably be an interface or inherit from an interface...for now, extend Waits! - malexander 12/20/18

/**
 * Page Object Model Class
 */
public class PageObjectModel extends Waits {

    /**
     * Returns a webelement if found
     *
     * @param driver
     * @param element
     * @return
     */
    public WebElement findElement(WebDriver driver, Element element) {
        WebElement ele = null;
        switch (element.getSelectorType()) {
            case XPATH:
                ele = driver.findElement(By.xpath(element.getSelector()));
                break;
            case ID:
                ele = driver.findElement(By.id(element.getSelector()));
                break;
            case LINK:
                ele = driver.findElement(By.linkText(element.getSelector()));
                break;
            case PARTIAL_LINK:
                ele = driver.findElement(By.partialLinkText(element.getSelector()));
                break;
            case NAME:
                ele = driver.findElement(By.name(element.getSelector()));
                break;
            case TAG:
                ele = driver.findElement(By.tagName(element.getSelector()));
                break;
            case CLASS:
                ele = driver.findElement(By.className(element.getSelector()));
                break;
            case CSS:
                ele = driver.findElement(By.cssSelector(element.getSelector()));
                break;
        }
        return ele;
    }

    /**
     * Click Element on page
     *
     * @param driver  Webdriver
     * @param element Element to be clicked
     */
    public void clickElement(WebDriver driver, Element element) {
        findElement(driver, element).click();
        System.out.println(String.format("Click '%s'", element.getDescription()));
    }

    /**
     * Enter text onto page
     *
     * @param driver    Webdriver
     * @param element   Element to enter test into
     * @param inputText Text to enter into element
     */
    public void inputText(WebDriver driver, Element element, String inputText) {
        WebElement ele = findElement(driver, element);
        ele.clear();
        ele.sendKeys(inputText);
        System.out.println(String.format("Entering '%s' into '%s'", inputText, element.getDescription()));
    }

    /**
     * Returns Text of Element
     *
     * @param driver  Webdriver
     * @param element Element to obtain text from
     * @return Elements text
     */
    public String getElementText(WebDriver driver, Element element) {
        return findElement(driver, element).getText();
    }
}
