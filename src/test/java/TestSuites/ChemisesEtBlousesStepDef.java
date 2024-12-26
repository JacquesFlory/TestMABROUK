package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.ConfigMab;
import Page.HomePageChemBlou;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemisesEtBlousesStepDef {
	

	@Given("utilisateur est sur la page {string}")
	public void utilisateur_est_sur_la_page(String string) {

	ConfigMab.driver= new ChromeDriver();
	ConfigMab.maximiseWindow();
	String url= "https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
	ConfigMab.driver.get(url);
}

@When("utilisateur clique sur le produit {string}")
public void utilisateur_clique_sur_le_produit(String NomProduit) {
	HomePageChemBlou page= new HomePageChemBlou();
	page.clickOnSpecificProduct(NomProduit);
}
  

@Then("utilisateur est dirige vers la page du produit {string}")
public void utilisateur_est_dirige_vers_la_page_du_produit(String NomProduit) {
	HomePageChemBlou page= new HomePageChemBlou();
	page.verifProducte(NomProduit);
  
}

}
