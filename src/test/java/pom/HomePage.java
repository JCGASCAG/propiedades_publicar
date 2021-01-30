package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //@FindBy(id = "desktop-search-bar")
    @FindBy(xpath = "(//div[@class='navbar-collapse'])")
    private WebElement menu;

    @FindBy(xpath = "(//a[@class='login-admin'])[1]")
    private WebElement publicar;

    @FindBy(xpath = "(//p[@class='benefits-title'])[1]")
    private WebElement benefici;

    @FindBy(xpath = "(//p[@class='card-highlighted-title'])[1]")
    private WebElement tap;

    private String titleHomePage = "propiedades.com";


    public HomePage(WebDriver driver){

        super(driver);
    }

    public void publicar() throws  Exception{
        this.isDisplayed(publicar);
    }
    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }
    public void etiquetaIsDisplayed() throws Exception {
        this.isDisplayed(menu);
    }
    public void botonPrecIsDisplayed() throws Exception {
        this.isDisplayed(benefici);
    }

    public void tapIsDisplayed() throws Exception {
        this.isDisplayed(tap);
    }

}
