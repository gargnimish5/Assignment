package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By firstNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By emailInput = By.id("email_address");
    private By passwordInput = By.id("password");
    private By confirmPasswordInput = By.id("password-confirmation");
    private By registerButton = By.xpath("//*[@id='form-validate']//button");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        sendKeys(firstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeys(lastNameInput, lastName);
    }

    public void enterEmail(String email) {
        sendKeys(emailInput, email);
    }

    public void enterPassword(String password) {
        sendKeys(passwordInput, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendKeys(confirmPasswordInput, confirmPassword);
    }

    public void clickRegister() {
        click(registerButton);
    }
}
