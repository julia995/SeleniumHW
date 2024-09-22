import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        //User ID
        WebElement userID = driver.findElement(By.cssSelector("input[id='UserID']"));
        userID.sendKeys("0242");

        //User name
        WebElement username = driver.findElement(By.cssSelector("input[id='UserName']"));
        username.sendKeys("Julia");

        //Intro to Lecture
        WebElement intro = driver.findElement(By.cssSelector("input[name*='LectureIntro']"));
        intro.sendKeys("Lecture Introduction text");

        //Feedback from Ray
        WebElement feedbackRay = driver.findElement(By.cssSelector("input[id='FeedbackFromRay']"));
        feedbackRay.sendKeys("Amazing work!");

        //Feedback from Ducky
        WebElement feedbackDucky = driver.findElement(By.cssSelector("input[id='FeedbackfromDucky']"));
        feedbackDucky.sendKeys("Great!");

        //Client ID
        WebElement clientId = driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clientId.sendKeys("Sam234");

        //Email
        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("Sam@gmail.com");

        //course topic
        WebElement topic = driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        topic.sendKeys("CSS selectors");
        







    }
}
