package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.manage().window().maximize();
WebDriverWait wait =new WebDriverWait(dr, 60);
dr.get("http://classroom:8888");
dr.findElement(By.name("user_name")).sendKeys("qaplanet1");
dr.findElement(By.name("user_password")).sendKeys("lab1");
dr.findElement(By.id("submitButton")).click();
//dr.findElement(
	}

}
