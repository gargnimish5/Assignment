package stepDefinitions;

import PageObject.HomePage;
import PageObject.LoginHomePage;
import PageObject.RegisterPage;
import PageObject.SignInPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;

public class RegisterSteps {
    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    LoginHomePage loginHomePage;
    SignInPage signInPage;
    ConfigReader config = new ConfigReader();

    @Given("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.getProperty("url"));
        homePage = new HomePage(driver);
        homePage.clickCreateAccount();
    }

    @When("I enter valid details")
    public void i_enter_valid_details() {
        registerPage = new RegisterPage(driver);
        registerPage.enterFirstName(config.getProperty("firstName"));
        registerPage.enterLastName(config.getProperty("lastName"));
        registerPage.enterEmail(config.getProperty("email"));
        registerPage.enterPassword(config.getProperty("password"));
        registerPage.enterConfirmPassword(config.getProperty("password"));
    }

    @And("I submit the registration form")
    public void i_submit_the_registration_form() {
        registerPage.clickRegister();
    }

    @Then("I should see a registration success message")
    public void i_should_see_a_registration_success_message() {
        String expectedMessage = config.getProperty("signUpMessage");
        String actualMessage = loginHomePage.getRegistrationSuccessMessage();
        assertEquals(expectedMessage, actualMessage);
        loginHomePage.loginOut();
        driver.quit();
    }

    @Given("I navigate to the sign-in page")
    public void i_navigate_to_the_sign_in_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.getProperty("signInUrl"));
        signInPage = new SignInPage(driver);
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        signInPage.enterEmail(config.getProperty("email"));
        signInPage.enterPassword(config.getProperty("password"));
    }

    @And("I submit the sign-in form")
    public void i_submit_the_sign_in_form() {
        signInPage.clickSignIn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertTrue("My Account heading is not visible",loginHomePage.verifyMyAccount());
        Assert.assertEquals("Email is not correct from which you are login",
                loginHomePage.getEmailAfterLogin(),config.getProperty("email"));
        driver.quit();
    }
}
