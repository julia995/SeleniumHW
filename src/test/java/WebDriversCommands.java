import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversCommands {
    public static void main(String[] args) {
        //1. The user successfully opens Chrome and maximizes the window using `window().maximize()`.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.The user navigates to `www.google.com`, and the page title is printed correctly.
        driver.navigate().to("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("the title is "+title);

        //3. The user navigates to `https://www.syntaxprojects.com/`, and the page title is printed correctly.
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2 = driver.getTitle();
        System.out.println("the title is "+title2);

        //4. The user successfully navigates back to `www.google.com` using `navigate().back()`.
        driver.navigate().back();

        //5. The page at `www.google.com` is refreshed using `navigate().refresh()`.
        driver.navigate().refresh();

        //6. The browser closes after completing all the navigation steps.
        driver.close();
    }
}
