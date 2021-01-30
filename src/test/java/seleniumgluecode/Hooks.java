package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static  DriverManager driverManager;
    // Método que se va a ejecutar antes de cada scenario
    @Before
    public void setup(){
        // Manejara los distintos navegadores
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://propiedades.com/publicar");
        driver.manage().window().maximize();
    }
    // Método que se va a después de cada Test
    @After
    public void terDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
