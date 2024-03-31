package selenium_project;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test1(){
        System.setProperty("Webdriver.Chrome.driver", "/Users/murodjoni/Desktop/Selenium_Automation_JAVA/drivers/chromedriver.exe");
        
        //Setting a base URL that can be called by name
        String baseURL = "https://turantech.com/apply";

        //Initializing Chromdriver 
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Opening webpage by calling baseURL
        driver.get(baseURL);

        //Finding firstName Element and sending text to enter
        driver.findElement(By.id("firstName")).sendKeys("Akhmat");;
        //Finding astName Element and sending text to enter
        driver.findElement(By.id("lastName")).sendKeys("Khuja");
        //Finding email adress Element and sending text to enter
        driver.findElement(By.id("emailAddress")).sendKeys("akhmatkhuja@skeep.com");
        //Finding element by XPATH and entering text as input
        driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("801-123-4567");

        driver.close();
    }
}
