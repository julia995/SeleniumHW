import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        //1. Select Age Checkbox:
        //- Select the **Age** checkbox.
        driver.switchTo().frame("dropdownIframe");
        driver.switchTo().frame("checkboxIframe");

        WebElement ageCB = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        ageCB.click();

        //2. **Select City**:
        //- Select any city from the dropdown.
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement DD = driver.findElement(By.xpath("//select[@id='cities']"));
        DD.click();

        Select sel = new Select(DD);
        sel.selectByVisibleText("Houston");

        //3. **Enter Username**:
        //-enter your username in the **Username** field.
        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");

        WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("julia");


    }
}
