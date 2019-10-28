package publicmodule;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SysProp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.dnd.InvalidDnDOperationException;


public class PLPTest {


    @BeforeMethod
    public void setUp() throws Exception {
        SysProp.getInstance().openBrowser();
        SysProp.getInstance().navigateToURL();
        //("webdriver.chrome.driver", "C:\\DEV\\sdb-issues\\automation\\chromedriver_win32\\chromedriver.exe");
        ///SysProp.getInstance().driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
    }

    @Test
    public void testPLP() throws Exception {
        SysProp.getInstance().getDriver().findElement(By.linkText("/applicant/ApplicantLoginRegServlet")).click();
        String currentURL="";
        String ExpectedURL="http://topjobs.mk:8080/applicant/login.jsp?r=index.jsp";
        if(currentURL.equalsIgnoreCase(ExpectedURL)){
            System.out.println(" Current url is correct"+currentURL);
        }
        else {
            System.out.println("Current Url is incorrect");

        }
        SysProp.getInstance().getDriver().findElement(By.name("txtUsername")).sendKeys("manatest");
        SysProp.getInstance().getDriver().findElement(By.name("txtPassword")).sendKeys("manatest");
        SysProp.getInstance().getDriver().findElement(By.id("login-button")).click();
        SysProp.getInstance().getDriver().findElement(By.name("txtUsername")).clear();
        SysProp.getInstance().getDriver().findElement(By.name("txtPassword")).clear();



        String currentURL2="";
        String ExpectedURL2="http://topjobs.mk:8080/applicant/welcome.jsp";
        if(currentURL2.equalsIgnoreCase(ExpectedURL2)){
            System.out.println(" Current url is correct"+currentURL2);
        }
        else {
            System.out.println("Current Url is incorrect");
        }

        SysProp.getInstance().getDriver().findElement(By.name("Log Out")).click();




    }
    @AfterTest
    public void close()  throws Exception{
        SysProp.getInstance().getDriver().close();

    }
}
