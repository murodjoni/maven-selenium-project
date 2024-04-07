package selenium_project;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class TuranTechApplyPage 
{
    @Test
    public void test1(){
        System.setProperty("Webdriver.Chrome.driver", "/Users/murodjoni/Desktop/Selenium_Automation_JAVA/drivers/chromedriver.exe");
        
        //Setting a base URL that can be called by name
        String baseURL = "https://turantech.com/apply";

        //Initializing Chromdriver 
        WebDriver driver = new ChromeDriver();
        
        //Opening webpage by calling baseURL
        driver.get(baseURL);
        //Refreshing page
        driver.navigate().refresh();
        //Waiting
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Finding firstName Element and sending text to enter
        driver.findElement(By.id("firstName")).sendKeys("King");;
        //Finding astName Element and sending text to enter
        driver.findElement(By.id("lastName")).sendKeys("Fisher");
        //Finding email adress Element and sending text to enter
        driver.findElement(By.id("emailAddress")).sendKeys("raulgonzalez@skeep.com");
        //Finding element by XPATH and entering text as input
        driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("801-123-7559");
        
        driver.close();
    }
}
