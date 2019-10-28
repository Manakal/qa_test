package publicmodule;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SysProp;


public class PLPTest {


    @BeforeMethod
    public void setUp() throws Exception {
        SysProp.getInstance().openBrowser();
        SysProp.getInstance().navigateToURL();
    }

    @Test
    public void testPLP() throws Exception {

    }
}