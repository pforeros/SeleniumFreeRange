package pages;

public class PaginaFundamentosTesting extends BasePage{
    private String introduccionTestingLink = "//a[@href='/introduccion-al-testing-de-software']";
    public PaginaFundamentosTesting(){
        super(driver);
    }
    public void clickIntroduccionTestingLink(){
        clickElement (introduccionTestingLink);

    }
}
