package selenium_project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
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

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/");
        driver.quit();
    }
}
