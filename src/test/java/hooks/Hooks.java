package hooks;


import io.cucumber.java.Before;
import org.junit.After;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
