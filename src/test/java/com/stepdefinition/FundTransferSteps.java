package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class FundTransferSteps {

	 

	    static WebDriver driver;

	 

	    @Given("user is on bank page")
	    public void user_is_on_bank_page() {
	        System.setProperty("webdriver.chrome.driver",
	                "D:\\Eclipse\\cucumber_fundtransfer.zip_expanded\\CucumberTest\\dri\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://demo.rapidtestpro.com/login.php");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	    }

	 

	    @When("user enters username and password")
	    public void user_enters_username_and_password() throws InterruptedException {

	 

	        driver.findElement(By.id("accno")).sendKeys("1234556666");
	        driver.findElement(By.id("pass")).sendKeys("MavDemo@01");

	        Thread.sleep(2000);

	    }

	 

	    @Then("user click login buttons")
	    public void user_click_login_button() {

	 

	        driver.findElement(By.id("submitButton")).click();
	    }

	 

	    @Then("user has to enter the PIN number and Click on Validate PIN")
	    public void user_has_to_enter_the_PIN_number_and_Click_on_Validate_PIN() throws InterruptedException {
	        driver.findElement(By.id("accpin")).sendKeys("12345");
	        driver.findElement(By.id("submitButton")).click();
	        String welcome = driver.findElement(By.xpath("//strong[contains(text(),'Welcome, TOUSIF KHAN')]")).getText();
	        System.out.println(welcome);
	        Thread.sleep(2000);
	    }

	 

	    @Given("user click the fund transfer button")
	    public void user_click_the_fund_transfer_button() throws InterruptedException {

	    

	        driver.findElement(By.xpath("//a[contains(text(),'Fund Transfers')]")).click();
	        Thread.sleep(2000);
	    }

	 

	    @When("user fill the form")
	    public void user_fill_the_form() throws InterruptedException {
	        driver.findElement(By.xpath("//input[@name='rbname']")).sendKeys("ASDFGH");
	        driver.findElement(By.xpath("//input[@name='rname']")).sendKeys("VULCAN");
	        driver.findElement(By.id("accno")).sendKeys("2875368163");
	        driver.findElement(By.xpath("//input[@name='swift']")).sendKeys("123456789");
	        driver.findElement(By.id("amt")).sendKeys("-30");
	        WebElement fto = driver.findElement(By.xpath("//select[@id='toption']"));
	        fto.click();
	        Select element = new Select(fto);
	        element.selectByVisibleText("International Transfer");
	        driver.findElement(By.xpath(" //input[@id='dot']")).sendKeys("09202020");
	        driver.findElement(By.xpath(" //textarea[@id='desc']")).sendKeys("Transfering -$30");

	        Thread.sleep(4000);

	    }

	 

	    @When("click the transfer button")
	    public void click_the_transfer_button() throws InterruptedException {

	 

	        driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	        Thread.sleep(2000);
	    }

	 

	    @Then("the OTP page is displayed")
	    public void the_OTP_page_is_displayed() {

	 

	        String otp = driver.findElement(By.xpath("//h2[contains(text(),'Transaction Authorization Code')]")).getText();
	        System.out.println(otp);
	    }

	 

	    @When("user enter the OTP and Clicking validate VAT")
	    public void user_enter_the_OTP_and_Clicking_validate_VAT() throws InterruptedException {

	 

	        driver.findElement(By.id("token")).sendKeys("123456");
	        driver.findElement(By.id("submitButton")).click();

	        Thread.sleep(4000);

	    }

	 

	    @Then("successful transfer page with transaction details is displayed")
	    public void successful_transfer_page_with_transaction_details_is_displayed() throws IOException, InterruptedException {

	 

	        String success = driver
	                .findElement(By.xpath("//strong[contains(text(),'International Transaction Successful')]")).getText();
	        System.out.println(success);
	        TakesScreenshot scrsht = (TakesScreenshot) driver;
	        File source = scrsht.getScreenshotAs(OutputType.FILE);
	        System.out.println(source);
	        File destination = new File("D:\\Eclipse\\CucumberTest\\Screenshot\\filename.png");
	        FileUtils.copyFile(source, destination);
	        System.out.println("Snapshot taken");
	        Thread.sleep(4000);
	    }
	    
	    @Given("user click the sign out button")
	    public void user_click_the_sign_out_button() {
	        driver.findElement(By.linkText("Sign Out")).click();
	    
	    }

	 
	}


