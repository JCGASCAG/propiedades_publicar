package runner.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract  class DriverManager {
    protected WebDriver driver;

    protected abstract void createDriver();
    // Metodos para cerrar y obtener la instancia del driver
    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }
}
