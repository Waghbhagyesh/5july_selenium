package org.AlertEx2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx2 {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("close-fixedban")).click();
		driver.findElement(By.id("confirmButton")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
//		alt.accept();
		alt.dismiss();
		
	}

}
