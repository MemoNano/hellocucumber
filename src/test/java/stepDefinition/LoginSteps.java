package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Home;
import model.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Login Test Steps for Cucumber BDD
 */
public class LoginSteps {
    private static WebDriver driver;

    private Home home = new Home();
    private Login login = new Login();

    @Before
    public void startTest() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        driver.get("https://staging-m-sprint.pizzahut.com/index.php");
    }

    @When("^User Navigates to LogIn Page$")
    public void userNavigatesToLoginPage() throws Throwable {
        home.clickSignIn(driver);
    }

    @When("^User enters UserName and Password$")
    public void userEntersUserNameAndPassword() throws Throwable {
        login.enterEmail(driver, "malexander456@mailinator.com");
        login.enterPassword(driver, "chicago1");
        login.clickSubmitButton(driver);
    }

    @Then("^Message displayed Login Successfully$")
    public void messageDisplayedLoginSuccessfully() throws Throwable {
        assert home.getWelcomeHeaderText(driver).toLowerCase().equals("Hi, matt!".toLowerCase());
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void userLogOutFromApplication() throws Throwable {
        home.clickSignOut(driver);
    }

    @Then("^Message displayed LogOut Successfully$")
    public void messageDisplayedLogOutSuccessfully() throws Throwable {
        assert home.getWelcomeHeaderText(driver).toLowerCase().equals("Welcome to Pizza Hut!".toLowerCase());
        System.out.println("LogOut Successfully");
    }

    @Given("^A users logs into the site")
    public void userLogsIntoTheSite() throws Throwable {
        userIsOnHomePage();
        userNavigatesToLoginPage();
        userEntersUserNameAndPassword();
    }

    @After
    public void closeBrowser() throws Throwable {
        driver.quit();
    }
}
