import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        //1.The user should be able to launch a web browser and navigate to the URL `https://www.syntaxprojects.com/`
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.syntaxprojects.com/");

        //2. The user should be able to maximize the browser window
        driver.manage().window().maximize();

        //2. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
        String url = driver.getCurrentUrl();
        System.out.println("the url is " + url);

        //3. The page title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.
        String title = driver.getTitle();
        System.out.println("the title is " + title);


        //4. The browser should close automatically after retrieving both the URL and title.
        driver.quit();
    }
}
