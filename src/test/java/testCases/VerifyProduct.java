package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class VerifyProduct {
  public WebDriver wd=null;
  public String data,data2,data1,data3;
  
  
 
	
	@Given ("^open  browser as (.*)$")
	public void openbrowser(String browser){
    		
		 wd=VerifyDataTest.openbrowser();
	}
	@When ("^enter url as (.*)$")
	public void enterurl(String url){
		
		VerifyDataTest.enterUrl(wd, url);
		}
	@When ("^search product as (.*)$")
	public void searchproduct(String productname ){
		
		VerifyDataTest.searchSamsung(wd, productname);
	}
	@And ("^click the first link$")
	public void clickLink(){
     
		data1=VerifyDataTest.productprice(wd);
		data=VerifyDataTest.clcikLInk(wd);
	 
	}
	@When ("^switch to child window$")
	public void switchChildWindow(){
	
		data2=VerifyDataTest.swithtoChild(wd);
		data3=VerifyDataTest.productprice1(wd);

	}
	@And ("^verify the product name and price$")
	public void VerifyProduct(){
		
		VerifyDataTest.verifyProduct(data, data2, data1, data3);
	}
	@When ("^enter the pincode as (.*)$")
	public void enterPincode(String pincode){
		

		
		
		
	}



	

}
