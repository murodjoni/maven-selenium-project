package selenium_project;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        //Click to expand Program type dropdown
        WebElement programDropdown = driver.findElement(By.className("sc-hHTYSt bcFtWT"));
        programDropdown.click();
        //Select program type from list
        WebElement selectProgram = driver.findElement(By.className("sc-kgTSHT jWDbcP"));
        selectProgram.click();

        //Click Cohort dropdown to expand the list
        WebElement cohortDropdown = driver.findElement(By.className("sc-hHTYSt iaiZcF"));
        cohortDropdown.click();

        //Select Cohort date from list
        WebElement selectCohort = driver.findElement(By.className("sc-dmctIk edPAOL"));
        selectCohort.click();

         //Click Location dropdown to expand the list
         WebElement locationDropdown = driver.findElement(By.className("sc-hHTYSt clJtzv"));
         locationDropdown.click();

         //Select Location from list
        WebElement selectLocation = driver.findElement(By.className("sc-dmctIk edPAOL"));
        selectLocation.click();

    }
}
