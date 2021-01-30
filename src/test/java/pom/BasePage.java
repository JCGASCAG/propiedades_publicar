package pom;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo realizar el click sobre el elemento " + element);
        }
    }

    public void scroll() throws Exception {
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,390)");
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }catch (Exception e){
            throw new Exception("No se pudo realizar el scroll " + e.getMessage());
        }
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }catch (Exception e){
            throw new Exception("No se pudo realizar el click sobre el elemento " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("El elemento " + element + " no es visible en el DOM");
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("El elemento " + element + " no es visible en el DOM");
        }
    }

    public String getText(By element) throws Exception {
        try {

            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }

    }

    public String getText(WebElement element) throws Exception {
        try {

            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    public void setText(By element,String arg) throws Exception {
        try {
            driver.findElement(element).sendKeys(arg);
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }

    }

    public void setText(WebElement element,String arg) throws Exception {
        try {
            element.sendKeys(arg);
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }






    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo de la pestaña");
        }

    }


}
