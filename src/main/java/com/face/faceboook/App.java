package com.face.faceboook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main( String[] args ) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\Desktop\\chrome\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.id("email")).sendKeys("kiransuryawanshi2108ks@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.name("login")).click();
     
    }
}