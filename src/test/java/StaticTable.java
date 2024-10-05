import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        //1. **Print All Entries with the Country "USA"**:
        //   - Dynamically search the table for entries where the country is **"USA"**.
        //   - Print all the rows matching criteria

        List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));


        //print row with "USA"
        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count=1;
        for (WebElement country:countries){
            String countryValue = country.getText();
            if(countryValue.equals("USA")){
                //print that row
                System.out.println(count);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());

            }
            count++;
        }


        //2. **Dynamic Logic**:
        //   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
        //   - The code should be flexible enough to accommodate changes in the country name
        //   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output should reflect the correct entries based on the updated country.
        List<WebElement> countries2 = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count1 = 1;
        for (WebElement country : countries2) {
            String countryValue = country.getText();
            if (countryValue.equals("Canada")) {
                //print that row
                System.out.println(count1);
                WebElement row1 = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count1 + "]"));
                System.out.println(row1.getText());

            }
            count1++;
        }


    }

}
