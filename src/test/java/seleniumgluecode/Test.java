package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase{

    @Given("^El usuario se encuentra en la pagina de propiedades$")
    public void el_usuario_se_encuentra_en_la_pagina_de_propiedades() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String titulo = "CommScope.com";
        //System.out.println(driver.getTitle());
        //Assert.assertEquals(titulo,driver.getTitle());
        //Assert.assertTrue(homePage.homePageIsDisplayed());
        homePage.publicar();


    }

    @When("^validar que contenga un menú principal$")
    public void validar_que_tenga_un_menu_principal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.etiquetaIsDisplayed();
    }
    @When("^validar que tenga un botón de Publica ahora$")
    public void validar_que_tenga_un_boton_publicar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.publicar();
    }

    @When("^validar que tenga la etiqueta de Beneficios$")
    public void validar_que_tenga_beneficios() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.botonPrecIsDisplayed();
    }
    @When("^validar que tenga el tap de Anuncios destacados$")
    public void validar_que_tenga_destacados() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.tapIsDisplayed();
    }






}
