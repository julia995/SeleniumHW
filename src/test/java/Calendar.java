import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");



        //1. **Select "From" and "To" Dates**:
        //   - Select the **From** date and the **To** date in the jQuery date picker.
        //   - The code logic should be **dynamic**, meaning it should work with any selected dates without requiring any changes to the core logic.
        //   - The selection should not rely on hard-coded date values and should be adaptable if the date range changes.

        WebElement calender1 = driver.findElement(By.xpath("//input[@id='from_date']"));
        calender1.click();

        boolean isfound=false;
        while (!isfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month.getText();
            String currentYear = year.getText();
            if (currentMonth.equals("January") && currentYear.equals("2025")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for(WebElement date:allDates){
                    if(date.getText().equals("13")){
                        date.click();
                        isfound=true;
                        break;
                    }
                }
            } else {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }

        WebElement calender2 = driver.findElement(By.xpath("//input[@id='to_date']"));
        calender2.click();

        boolean isfound1=false;
        while (!isfound1) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month.getText();
            String currentYear = year.getText();
            if (currentMonth.equals("January") && currentYear.equals("2025")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for(WebElement date:allDates){
                    if(date.getText().equals("23")){
                        date.click();
                        isfound1=true;
                        break;
                    }
                }
            } else {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}
