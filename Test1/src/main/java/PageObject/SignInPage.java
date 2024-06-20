package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private By emailInput = By.id("email");
    private By passwordInput = By.id("pass");
    private By signInButton = By.cssSelector("button[title='Sign In']");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        sendKeys(emailInput, email);
    }

    public void enterPassword(String password) {
        sendKeys(passwordInput, password);
    }

    public void clickSignIn() {
        click(signInButton);
    }
}
