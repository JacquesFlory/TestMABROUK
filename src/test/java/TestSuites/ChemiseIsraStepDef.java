package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.ConfigMab;
import Page.HomePageChIsra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseIsraStepDef {
	

@Given("Utilisateur accede a la page du produit {string}")
public void utilisateur_accede_a_la_page_du_produit(String string) {
	ConfigMab.driver= new ChromeDriver();
	ConfigMab.maximiseWindow();
	String url= "https://mabrouk.tn/produit/chemise-isra/";
	ConfigMab.driver.get(url);
  
}

@When("Utilisateur fait le choix de la couleur la taillte {string} et clique sur ajouter au panier")
public void utilisateur_fait_le_choix_de_la_couleur_la_taillte_et_clique_sur_ajouter_au_panier(String ProductOptions) {
	HomePageChIsra choix= new HomePageChIsra();
	choix.ClickOnProductOptions(ProductOptions);
  
}

@Then("Utilisateur verifie si le produit choisi avec ses critères est ajoute au panier {string}")
public void utilisateur_verifie_si_le_produit_choisi_avec_ses_critères_est_ajoute_au_panier(String ProdPanier) {
	HomePageChIsra choix= new HomePageChIsra();
	choix.VerifProdPanier(ProdPanier);
  
}

}
