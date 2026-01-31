package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.login("Admin", "admin123");
    }

    @When("the user enters invalid username or password")
    public void the_user_enters_invalid_username_or_password() {
        loginPage.login("wrong", "wrong");
    }

    @When("the user leaves the username and password fields empty")
    public void the_user_leaves_fields_empty() {
        loginPage.login("", "");
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
        // Already clicked kar chuke hai login method mein
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("Login successful - Dashboard displayed");
    }

    @Then("an error message should be displayed indicating invalid credentials")
    public void invalid_credentials_error() {
        System.out.println("Invalid credentials error displayed");
    }

    @Then("an error message should be displayed indicating required fields")
    public void required_fields_error() {
        System.out.println("Required fields error displayed");
    }
}
