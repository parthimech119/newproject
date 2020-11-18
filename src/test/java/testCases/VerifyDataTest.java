package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyDataTest {
	


	
	public static WebDriver openbrowser(){
		
		WebDriver wd=new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		return wd;
		
	}
	public static void enterUrl(WebDriver wd,String url){
		
		wd.get(url);
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	}
	public static void searchSamsung(WebDriver wd,String productname){
		
		   wd.findElement(By.name("q")).sendKeys(productname);
		   wd.findElement(By.name("q")).submit();
		 
	}
public static String productprice(WebDriver wd){
		
		WebElement input1=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div"));
		String  data1=input1.getText();
		return data1;
	}
	
	public  static String clcikLInk(WebDriver wd){
		
		
		 WebElement	input=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		 String   data= input.getText();
		   input.click();
		   return data;
	}

		
	public  static String swithtoChild(WebDriver wd){
		
		 Set<String> window= wd.getWindowHandles();
		 Iterator<String> it=window.iterator();
		 
		 String parentid=it.next();
		 String childid=it.next();
		 
		 wd.switchTo().window(childid);
		WebElement input2= wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span"));
		String data2=input2.getText();
		 return data2;
		
	}
	public static String productprice1(WebDriver wd){
		WebElement input3=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]"));
		String  data3=input3.getText();
		return data3;
		
	}
	public static void verifyProduct(String data,String data2,String data1,String data3){
		
        if((data.equals(data2))&&(data1.equals(data3))){
			
			System.out.println("test cases passes");
		}
		else{
			System.out.println("test case fail");
		}
	}
	public static void enterPincode(WebDriver wd,String  pincode){
		
		WebElement enterpincode=wd.findElement(By.className("_3X4tVa"));
		
		enterpincode.sendKeys(pincode);
		
		
	}
		
	
}
