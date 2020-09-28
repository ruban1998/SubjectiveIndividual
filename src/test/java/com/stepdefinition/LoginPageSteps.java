package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
    WebDriver driver;
    
    @Given("user is on Login page")
    public void user_is_on_adactin_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\cucumber_fundtransfer.zip_expanded\\CucumberTest\\dri\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       driver.get("http://demo.rapidtestpro.com/");
       Thread.sleep(2000);
    }

 

    @When("user enters {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        WebElement txtUserName=driver.findElement(By.id("accno"));
        txtUserName.sendKeys(username);
        
        WebElement txtPass=driver.findElement(By.id("pass"));
        txtPass.sendKeys(password);
    }
    
//    @When("user enters invalid {string} and {string}")
//    public void user_enters_invalid_username_and_password(String name, String password) {
//        WebElement txtUserName=driver.findElement(By.id("accno"));
//      //  txtUserName.sendKeys("1234556666");
//        
//        WebElement txtPass=driver.findElement(By.id("pass"));
//      //  txtPass.sendKeys("MavDemo@02");
//    }

    @When("user enters valid PIN")
    public void user_enters_valid_PIN() throws InterruptedException {
        WebElement txtUserName=driver.findElement(By.id("accpin"));
        txtUserName.sendKeys("12345");
        Thread.sleep(3000);
    }
 

    @Then("user click login button")
    public void user_click_login_button() throws InterruptedException {
        WebElement btnLogin = driver.findElement(By.id("submitButton"));
        btnLogin.click();
        Thread.sleep(4000);
        
    }

    @Then("user click validate button")
    public void user_click_validate_button() throws InterruptedException {
        WebElement btnLogin = driver.findElement(By.id("submitButton"));
        btnLogin.click();
        Thread.sleep(4000);
        
      
        
//        String url = driver.getCurrentUrl();
//        Assert.assertTrue(url.contains("index"));
//       String att = btnLogin.getText();
//       Assert.assertEquals(att, "Welcome");
//       System.out.println("Result is" + url);
        
    }
    @Then("user click the signout button")
    public void user_click_the_sign_out_button() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.linkText("Sign Out")).click();
}
}