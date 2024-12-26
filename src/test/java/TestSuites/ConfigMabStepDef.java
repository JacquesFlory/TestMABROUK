package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.ConfigMab;
import Page.HomePageMab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigMabStepDef {
	
	@Given("Utilisateur accede a la page daccueil")
	public void utilisateur_accede_a_la_page_daccueil() {
		ConfigMab.driver= new ChromeDriver();
		ConfigMab.maximiseWindow();
		String url= "https://mabrouk.tn/";
		ConfigMab.driver.get(url);
	}

	@When("Utilisateur survole la souris sur le menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu(String menuName) {
	    HomePageMab page= new HomePageMab();
	    page.mouseOverMenu(menuName);
	}

	@And("Utilisateur clique sur le submenu {string}")
	public void utilisateur_clique_sur_le_submenu(String submenuName) {
		HomePageMab page= new HomePageMab();
		page.clickOnProduct(submenuName);
	  
	}

	@Then("Utilisateur est dirige vers la page du submenu {string}")
	public void utilisateur_est_dirige_vers_la_page_du_submenu(String Name) {
		HomePageMab page= new HomePageMab();
		page.verif(Name);
	
	}
}