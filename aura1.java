package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class aura1
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/ts-chandana.s/drivers/chromedriver");
        WebDriver driver1=new ChromeDriver();

        driver1.get("http://auranetworks.in/");


        System.out.println(driver1.getTitle());
        driver1.manage().window().maximize();
        driver1.findElement(By.xpath("//a[normalize-space()='FIND YOUR COURSE']")).click();
        String actual_url=driver1.getCurrentUrl();
        String des_url="http://auranetworks.in/contact-us/#apply-now";
        if(actual_url.equals(des_url))
            System.out.println("pass");
        else
            System.out.println("Fail");
        driver1.findElement(By.xpath("(//input[@name=\"your-name\"])[1]")).sendKeys("saketh");
        Thread.sleep(5000);


//        System.out.println("Username :"+username.toString());

        driver1.findElement(By.name("email")).sendKeys("vachan@gmail.com");
        driver1.findElement(By.name("Mobilenumber")).sendKeys("73479834233");
        driver1.findElement(By.xpath("(//input[@value='Connect With Us'])[1]")).click();
        Alert alertmsg=driver1.switchTo().alert();
        System.out.println(alertmsg.getText());
        driver1.close();




    }
}
