

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Ex_calender {
    public static void main(String[] args) throws InterruptedException {


      /*  Date formattedTargetdate;
        Calendar cal=Calendar.getInstance();

        String targetdate = "30-jan-2002";
        SimpleDateFormat targetdateFormat = new SimpleDateFormat("dd-mmm-yyyy");
        System.out.println(formattedTargetdate);

        try {
            targetdateFormat.setLenient(false);
            formattedTargetdate = targetdateFormat.parse(targetdate);
            Calendar.setTime(formattedTargetdate);

        }
        catch (ParseException e)
        {
        throw new Exception("Invalide date is provided");
    }
    }

}
*/

        System.setProperty("webdriver.chrome.driver", "/Users/ts-chandana.s/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        String month="June";
        String day="10";

        //WebElements
        WebElement selectDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--024']"));




        driver.findElement(By.id("dateOfBirthInput")).click();
        System.out.println("Clicked on Calendar");
        WebElement element = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"));
        WebElement clickNext = driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"));
        System.out.println("Before element.getText()");
        System.out.println(element.getText());
        boolean flag = true;
        while (flag){
            System.out.println("Inside while block...");
            if(!element.getText().equalsIgnoreCase("August 2022")){
                //Thread.sleep(2000);
                Boolean b = element.isDisplayed();
                System.out.println("Printing the boolean value -->  " + b);
                System.out.println("Inside If block...");
                //Thread.sleep(2000);
                clickNext.click();
            } else
                break;
        }

        selectDate.click();
       // driver.findElement(By.id("dateOfBirthInput")).clear();
        Thread.sleep(7000);
       // String myear="August 2022";
        //List<WebElement> cal=driver.findElements(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown"));
       // System.out.println(cal.size());
       // driver.findElement(By.id("dateOfBirthInput")).sendKeys("23 Jun 2025");

        //String db=driver.findElement(By.xpath()).getText();
        //System.out.println("Date of birth"+db);
        driver.quit();
    }}