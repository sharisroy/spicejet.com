package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoacationSlection {

    public void from(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(5000);
//        driver.findElement(By.linkText("Dhaka (DAC)")).click();
        System.out.println("done");
        Select select = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")));
//        select.selectByValue("ALA");
        select.selectByVisibleText("Dhaka (DAC)");
        System.out.println("done");

    }

}
