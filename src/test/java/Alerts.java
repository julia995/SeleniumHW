import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        //1. Birthday Reminder:
        //   - Click on the "Birthday Reminder" button.
        //   - When the alert appears, accept the alert.

        WebElement  BdayBtn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        BdayBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //2. Delete Confirmation:
        //   - Click on the **"Delete File"** button.
        //   - When the confirmation alert appears, **dismiss** the alert.
        //   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.

        WebElement  DeleteBtn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        DeleteBtn.click();
        alert.dismiss();

        WebElement confirmation = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        String confirmText = confirmation.getText();
        System.out.println(confirmText);

        //3. Name Collection:
        //   - Click on the **"Enter Your Name"** button.
        //   - Accept the alert and provide a name.
        //   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.

        WebElement  NameBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        NameBtn.click();

        alert.sendKeys("Julia");
        alert.accept();

        WebElement text = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String enteredNAme = text.getText();
        System.out.println(enteredNAme);




    }
}
