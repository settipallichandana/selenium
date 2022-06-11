package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Ex_checkboxes
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ts-chandana.s/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();



        List <WebElement> radio= driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
        System.out.println("No. of radio buttons are : "+ radio.size());

        //WebElement we2 = driver.findElement(By.id("gender-radio-2"));
       //we2.click();

        for(int i=0;i<radio.size();i++)
        {
            radio.get(i).click();
            //System.out.println("local radio"+local_radio.getAttribute());
          /*  boolean bool=local_radio.isSelected();
           if (bool==false)

                System.out.println("Selected "+radio.get(i));

            else
                System.out.println("Not selected "+radio.get(i));*/
            //local_radio.click();
          /*  String value = local_radio.getAttribute("value");

            Thread.sleep(2000);

           if(value.equals("Male"))
               System.out.println("Male selected");
           else if (value.equals("Female"))
               System.out.println("Female selected");
           else
               System.out.println("Other selected");*/


            Thread.sleep(2000);
            //div[@class='custom-control custom-checkbox custom-control-inline']



        }


        //System.out.println(radio2.isSelected());




        driver.quit();
    }
}

////div[@class='react-datepicker__day react-datepicker__day--016 react-datepicker__day--selected']