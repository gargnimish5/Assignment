package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHomePage  extends BasePage {
    private By registrationSuccessMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    private By loginMyAccount = By.xpath("//h1");
    private By emailLoginPage = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[1]/p/text()[3]");
    private By signOutdropButton = By.xpath("//h1");
    private By signOutButton = By.xpath("//li[@class=\"authorization-link\"]");

    public LoginHomePage(WebDriver driver) {
        super(driver);
    }

    public String getRegistrationSuccessMessage() {
        return getText(registrationSuccessMessage);
    }
    public String getEmailAfterLogin() {
        return getText(emailLoginPage);
    }
    public boolean verifyMyAccount() {
        return isDisplayed(loginMyAccount);
    }
    public void loginOut(){
        click(signOutdropButton);
        click(signOutButton);
    }
}
