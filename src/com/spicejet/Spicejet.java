package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Spicejet {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DAC']")).click();
        driver.findElement(By.xpath("//a[@value='VTZ']")).click();
        WebElement date = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_txt_Fromdate\"]"));

        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='20-12-2020' ",date);
        System.out.println("done");


    }
}
