package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

import static junit.framework.Assert.*;

public class LoginStepDefinition {


    WebDriver driver;

    @Given("^user is already on Login Page$")
    public void user_on_loginPage() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/chanyama/Desktop/SDET Learning/Chrome Driver");
        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/index.html");
    }

    @When("^title of login page is Free CRM$")
    public void verifyTitle() {
        String title = driver.getTitle();
        assertEquals("CRM", title);
    }

    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys("chicken");
        driver.findElement(By.name("password")).sendKeys("test@123");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        Assert.assertEquals("CRMPRO", title);
    }
}



