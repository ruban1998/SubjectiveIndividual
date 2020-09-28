package com.runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Eclipse\\cucumber_fundtransfer.zip_expanded\\CucumberTest\\src\\test\\resources\\feature\\FundTransfer.feature" }, plugin = {"pretty","html:target/Destination"} ,
		glue = {"com.stepdefinition" })

                

public class FundRunnerClass {

}
