package selenium_project;

//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class TuranTechApplyPage {

    public void Apply1(){
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
        driver.findElement(By.id("firstName")).sendKeys("Dalerjon");;
        //Finding astName Element and sending text to enter
        driver.findElement(By.id("lastName")).sendKeys("Ulmasov");
        //Finding email adress Element and sending text to enter
        driver.findElement(By.id("emailAddress")).sendKeys("dalerjonUlmasov06@gmail.com");
        //Finding element by XPATH and entering text as input
        driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("801-600-0900");


        //Click to expand Program type dropdown
        WebElement element = driver.findElement(By.cssSelector(".select-program button"));
        element.click();
        //Select program type from list
        WebElement selectProgram = driver.findElement(By.cssSelector(".select-program ul li:last-child"));
        selectProgram.click();

        //Click Cohort dropdown to expand the list
        WebElement cohortDropdown = driver.findElement(By.cssSelector(".select-cohort button"));
       cohortDropdown.click();

        //Select Cohort date from list
        WebElement selectCohort = driver.findElement(By.cssSelector(".select-cohort ul li:last-child"));
       selectCohort.click();

        // Click Location dropdown to expand the list
        WebElement locationDropdown = driver.findElement(By.cssSelector(".select-location button"));
       locationDropdown.click();

        // Select Location from list
       WebElement selectLocation = driver.findElement(By.cssSelector(".select-location ul li:last-child"));
        selectLocation.click();


        //Enter text in statement box
        driver.findElement(By.id("statementInput")).sendKeys("I want to get into tech because I heard it pays good money!");

        driver.close();
    }
}
