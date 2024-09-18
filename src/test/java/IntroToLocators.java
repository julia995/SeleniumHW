import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        //1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Julia Matiusheva");

        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("julia09.matyushevagmail.com");

        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Jane Doe");

        WebElement clientID = driver.findElement(By.id("ClientId"));
        clientID.sendKeys("100500");

        WebElement feedback = driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("Awesome work!");

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Test project name");

        WebElement deadline = driver.findElement(By.id("ProjectTimeId"));
        deadline.sendKeys("September 22");

        WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("123 Main St.");

        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("321 Test Street");


        //2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
        WebElement submitBtn = driver.findElement(By.name("btn-submit"));
        submitBtn.click();

        //4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.
        email.clear();
        email.sendKeys("julia09.matyusheva@gmail.com");

        submitBtn.click();

        //3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
        WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        clickHere.click();
    }

}
