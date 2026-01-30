package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import org.openqa.selenium.*;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on login page")
    public void openLoginPage() {
        driver = DriverFactory.getDriver();
        driver.get("https://example.com/login");
    }

    @When("user enters username and password")
    public void enterCredentials() {
        driver.findElement(By.id("user")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("1234");
    }

    @And("clicks on login button")
    public void clickLogin() {
        driver.findElement(By.id("login")).click();
    }

    @Then("user should see dashboard")
    public void verifyDashboard() {
        System.out.println("Login successful");
    }
}

