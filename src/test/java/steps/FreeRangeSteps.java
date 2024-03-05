package steps;

import java.util.List;
import org.testng.Assert;
import java.util.Arrays;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given ("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }
    @And("select Introducion al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroduccionTestingLink();
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }
        
    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans(){
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes \u2022 12 productos",
        "Academia: $176 / a\u00F1o \u2022 12 productos", 
        "Free: Gratis \u2022 1 producto");
        
        Assert.assertEquals(listaEsperada, lista);
        
    }
    }


