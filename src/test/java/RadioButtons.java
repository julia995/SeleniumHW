import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        //1. Choose Your Favorite Beverage:
        //   - Select the Juice radio button from the list of favorite beverages.
        WebElement juice = driver.findElement(By.xpath("//input[@value='Juice']"));
        juice.click();

        //2.Preferred Working Environment:
        //   - Retrieve all radio buttons in the Preferred Working Environment section.
        //   - Traverse through the list of radio buttons in code and select the Hybrid option.
        List<WebElement> allOptions = driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for(WebElement option: allOptions){
            if(option.getAttribute("value").equals("hybrid")){
                option.click();
            }
        }

        /*3. Choose Your Favorite Season:
        - If the Spring radio button is disabled, click on the "Enable Buttons" button.
                - Ensure that the Spring option is now enabled, then select it.
        - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
                - Verify that the Winter option is displayed after clicking and is available for selection.*/

        WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
        boolean stateOfSpring = spring.isEnabled();
        if (!stateOfSpring){
            WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
            enableBtn.click();
        }

        boolean stateofSpring = spring.isEnabled();
        if (stateofSpring){
            spring.click();
        }

        WebElement winter = driver.findElement(By.xpath("//input[@value='winter']"));
        boolean isWinterHidden = winter.isDisplayed();

        if(!isWinterHidden){
            WebElement showBtn = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
            showBtn.click();
        }
        boolean isWinterHidden2 = winter.isDisplayed();
        winter.click();

        //4. Choose Your Favorite Meal:
        //   - Select the Lunch radio button from the list of favorite meals.

        WebElement lunch = driver.findElement(By.xpath("//input[@value='lunch']"));
        lunch.click();










    }
}
