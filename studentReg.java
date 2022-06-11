package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


        public class studentReg {
            public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/Users/ts-chandana.s/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();

                driver.get("https://demoqa.com/automation-practice-form");
                driver.manage().window().maximize();


                driver.findElement(By.id("firstName")).sendKeys("Chandana");
                driver.findElement(By.id("lastName")).sendKeys("ABC");
                driver.findElement(By.cssSelector("input#userEmail")).sendKeys("abc@gmail.com");

                List <WebElement> radio= driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
                System.out.println("No. of radio buttons are : "+ radio.size());
                for(int i=0;i<radio.size();i++) {
                    radio.get(i).click();
                    //Thread.sleep(2000);
                }
                driver.findElement(By.id("userNumber")).sendKeys("1234567890");
                driver.findElement(By.id("subjectsInput")).sendKeys("abc123");

/*                JavascriptExecutor js = (JavascriptExecutor)driver;


                Actions action = new Actions(driver);
                action.moveToElement(abc).build().perform();
                js.executeScript("arguments[0].click();", abc);
                //abc.click();
                js.executeScript("document.getElementById(id).value='abc123';");
                abc.sendKeys("abc123");
                //driver.get("https://www.amazon.in/");

                 /*
                driver.findElement(By.linkText("Watches")).click();
                driver.findElement(By.partialLinkText("jewellery")).click();
                Thread.sleep(2000);


                // find multiple tags-list of webelements

                List <WebElement> alist = driver.findElements(By.tagName("a"));
                //listing of all links
                System.out.println(alist.size());
                for(WebElement l : alist)
                     System.out.println(l.getText());

                  */


            }

            }
