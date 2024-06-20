package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By createAccountLink = By.linkText("Create an Account");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccount() {
        click(createAccountLink);
    }
}
