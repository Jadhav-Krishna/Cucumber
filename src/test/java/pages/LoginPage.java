package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void openLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
    }

    public void login(String user, String pass) {

        if (!user.isEmpty()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        }

        if (!pass.isEmpty()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
        }

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
