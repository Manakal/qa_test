package publicmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JobseekerLoginTest {
    public static void main(String[] args) throws InterruptedException { //psvm and press tab key, this command will be auto generated!

        //System.setProperty("webdriver.chrome.driver","C:\\DEV\\sdb-issues\\automation\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\DEV\\sdb-issues\\automation\\chromedriver_win32\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.topjobs.lk/");
        driver.manage().window().maximize();

        driver.findElement(By.id("headerbar-jslogin")).click();
        driver.navigate().back(); //***Navigate Back***
        driver.get("http://www.topjobs.lk/");
        driver.findElement(By.id("sidebar-jslogin")).click();

    }
}
