package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Ex_dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ts-chandana.s/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");

        WebElement dropdown= driver.findElement(By.id("owc"));
        Select selectoption= new Select(dropdown);
        selectoption.selectByIndex(1);
        Thread.sleep(1000);
        selectoption.selectByValue("option 2");
        Thread.sleep(1000);
        selectoption.selectByVisibleText("Option 3");
        Thread.sleep(1000);
        driver.quit();
        System.out.println("done");

    }

}