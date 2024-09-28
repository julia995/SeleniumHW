import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //1. Subscribe to Newsletter:
        //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.

        WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if(newsletter.isEnabled()){
            newsletter.click();
        }

        //2.Select Your Hobbies:
        //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.

        List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));

        for( WebElement hobbies:allHobbies){
            if (hobbies.getAttribute("value").equals("reading") || hobbies.getAttribute("value").equals("cooking")){
                hobbies.click();
            }
        }

        //3. Select Your Interests:
        //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
        //   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.

        WebElement support = driver.findElement(By.xpath("//input[@value='Support']"));
        boolean visibilitySupport = support.isDisplayed();
        System.out.println(visibilitySupport);

        WebElement music = driver.findElement(By.xpath("//input[@value='Music']"));
        boolean visibilityMusic = music.isDisplayed();
        System.out.println(visibilityMusic);

        WebElement toggleBtn = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        toggleBtn.click();
        Thread.sleep(2000);
        if(music.isDisplayed()){
            music.click();
        }


        //4. Preferences:
        //   - Verify that the **Receive Notifications** checkbox is disabled.
        //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
        WebElement notifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        boolean stateOfNotifications = notifications.isEnabled();
        System.out.println(stateOfNotifications);

        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableBtn.click();
        notifications.click();



    }
}
