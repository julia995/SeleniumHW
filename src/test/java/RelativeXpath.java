import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        //1. The user is able to enter their hobbies using XPath.

        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Reading books");

        //2. When the user clicks the "Click Here" button using XPath.,
        //   Then the message `"Button clicked:"` should be displayed on the screen.
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickBtn.click();

        //3. The user successfully enters their favorite movie using XPath to find the text boxes.
        WebElement movies = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movies.sendKeys("Star Wars");

        //4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        WebElement text = driver.findElement(By.xpath("//label[contains(text(), 'Quaerat aliquam facere')]"));
        String printTetx = text.getText();
        System.out.println(printTetx);

        //5. The user is able to enter the city in the designated field.
        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Baltimore");

        //6. The user must use the **indexing technique** learned in class to enter  email addresses.

        //personal email
        WebElement personalEmail = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        personalEmail.sendKeys("personal@gmail.com");

        //office email
        WebElement officeEmail = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
        officeEmail.sendKeys("office@gmail.com");

        //professional email
        WebElement profEmail = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
        profEmail.sendKeys("prof@gmail.com");

        //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
        WebElement clientName = driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName']"));
        clientName.sendKeys("Jane Doe");

        WebElement clientID = driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientID.sendKeys("1345");

        //8. The user can use **any XPath technique** to enter the street number and house number.
        WebElement streetNo = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("19");

        WebElement houseNo = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("199");












    }
}
