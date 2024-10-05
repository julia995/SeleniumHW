import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        //1. Click on Button B1:
        //   - Ensure that clicking on the **B1** button opens a new window.
        //   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.
        String main = driver.getWindowHandle();

        WebElement B1Btn = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1Btn.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equals("https://syntaxprojects.com/b1-page.php")){
                break;
            }
        }
        WebElement textOfWebsite = driver.findElement(By.xpath("//h2"));
        System.out.println(textOfWebsite.getText());

        //2. Click on Button B2:
        //   - Ensure that clicking on the **B2** button opens a new window.
        //   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.

        driver.switchTo().window(main);
        System.out.println(driver.getCurrentUrl());

        WebElement B2PageBtn = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        B2PageBtn.click();
        allHandles =driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equals("https://syntaxprojects.com/b2-page.php")){
                break;
            }
        }
        WebElement textOfWebsite2 = driver.findElement(By.xpath("//h2"));
        System.out.println(textOfWebsite2.getText());

        driver.quit();








    }
}
