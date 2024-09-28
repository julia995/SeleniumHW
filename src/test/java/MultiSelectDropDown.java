import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //1. Select List Demo:
        //   - Use the **Select** class to select the option **"Pear"** from the dropdown.
        //   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
        //   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.

        WebElement DD = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel = new Select(DD);

        sel.selectByVisibleText("Pear");

        List<WebElement> allOptions = sel.getOptions();

        for (WebElement option:allOptions){
            System.out.println(option.getText());
        }

        //2. Select Multiple Options:
        //   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
        //   - Using the **Select** class, make the following selections:
        //     - **Traveling**
        //     - **Cooking**
        //     - **Gardening**
        //   - Click the **"Get All Selected"** button and print the result on the console. - NOT WORKING ON WEBSITE
        //   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class. - - NOT WORKING ON WEBSITE
        //   - Click the **"Get All Selected"** button again and print the result on the console. -- NOT WORKING ON WEBSITE

        WebElement DD2 = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel2 = new Select(DD2);

        sel.selectByVisibleText("Traveling");
        sel.selectByVisibleText("Cooking");
        sel.selectByVisibleText("Gardening");

        WebElement getAll = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAll.click();

        Thread.sleep(5000);

        sel.deselectByVisibleText("Traveling");






    }
}
