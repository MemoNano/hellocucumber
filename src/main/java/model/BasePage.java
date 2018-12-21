package model;

import common.models.Element;
import common.models.PageObjectModel;
import org.openqa.selenium.WebDriver;

/**
 * Base Page Object Class. All Pages are built with this (Header and Footer)
 */
public class BasePage extends PageObjectModel {
    Element signInLink = new Element(Element.SelectorType.XPATH,
            ".//div[contains(@class, 'ph-hr-welcome')]//a[@data-analytics-action='Sign In']",
            "Sign In Link");
    Element signOutLink = new Element(Element.SelectorType.XPATH, ".//a/span[text()='(sign out)']", "Sign Out Button");
    Element welcomeHeader = new Element(Element.SelectorType.XPATH, ".//div[contains(@class,'ph-hr-welcome')]//span[@id='ph-hutrewards-welcome']", "Welcome Header");

    /**
     * Click Sign In link in Header
     *
     * @param driver Webdriver
     */
    public void clickSignIn(WebDriver driver) {
        this.clickElement(driver, signInLink);
    }

    /**
     * Click Sign Out link in Header
     *
     * @param driver Webdriver
     */
    public void clickSignOut(WebDriver driver) {
        this.clickElement(driver, signOutLink);
        this.waitForXSeconds(2);
    }

    /**
     * Get Welcome Header text
     *
     * @param driver Webdriver
     * @return text from Welcome Header
     */
    public String getWelcomeHeaderText(WebDriver driver) {
        return this.getElementText(driver, welcomeHeader);
    }
}
