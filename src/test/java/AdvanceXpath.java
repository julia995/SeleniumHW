import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        //1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
        WebElement least1 = driver.findElement(By.xpath("//input[@id='least-favorite']//preceding-sibling::input[2]"));
        least1.sendKeys("Harry Potter");

        WebElement least2 = driver.findElement(By.xpath("//input[@id='least-favorite']//preceding-sibling::input[1]"));
        least2.sendKeys("Don Quixote");

        WebElement least3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        least3.sendKeys("The Lord of The Rings");

        //2. The user should enter the name of their favorite book using advanced Xpath.

        WebElement favourite1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favourite1.sendKeys("The Da Vinci Code");

        WebElement favourite2 = driver.findElement(By.xpath("//input[@id='favouriteBook']//following-sibling::input[1]"));
        favourite2.sendKeys("Gone with the wind");

        WebElement favourite3 = driver.findElement(By.xpath("//input[@id='favouriteBook']//following-sibling::input[2]"));
        favourite3.sendKeys("The Alchemist");

        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("John");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Jack");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Joey");










    }
}
