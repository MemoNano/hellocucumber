package model;

import common.models.Element;
import org.openqa.selenium.WebDriver;

/**
 * Login Page Object Class
 */
public class Login extends BasePage {

    Element emailInput = new Element(Element.SelectorType.XPATH, ".//input[@id='email_signIn']", "Email Input");
    Element passwordInput = new Element(Element.SelectorType.ID, "password_signIn", "Password Input");
    Element signInSubmitButton = new Element(Element.SelectorType.XPATH, ".//button[@id='ph-login']", "Sign in Submit Button");

    /**
     * Enter email for login
     *
     * @param driver Webdriver
     * @param email  email string
     */
    public void enterEmail(WebDriver driver, String email) {
        this.inputText(driver, emailInput, email);
    }

    /**
     * Enter password for login
     *
     * @param driver   Webdriver
     * @param password password string
     */
    public void enterPassword(WebDriver driver, String password) {
        this.inputText(driver, passwordInput, password);
    }

    /**
     * Click Login Submit Button
     *
     * @param driver Webdriver
     */
    public void clickSubmitButton(WebDriver driver) {
        this.clickElement(driver, signInSubmitButton);
        this.waitForXSeconds(2);
    }

}
