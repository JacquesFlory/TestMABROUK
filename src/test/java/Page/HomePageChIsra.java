package Page;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.ConfigMab;

public class HomePageChIsra {
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[1]")
	WebElement Couleur;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[2]")
	WebElement Taille;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement Ajoutpanier;
	
	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
	WebElement VerifPanier ;
	
	public HomePageChIsra() {
		PageFactory.initElements(ConfigMab.driver, this);
		
	}
	
	public void ClickOnProductOptions (String ProductOptions){
		ConfigMab.attente(10);
		Couleur.click();
		ConfigMab.attente(10);
		Taille.click();
		ConfigMab.attente(10);
		try {
		    Ajoutpanier.click();
		} catch (ElementClickInterceptedException e) {
		    System.out.println("Element not clickable: " + e.getMessage());
		}

		JavascriptExecutor js = (JavascriptExecutor) ConfigMab.driver;
		js.executeScript("arguments[0].click();", Ajoutpanier);
	
		}
	
	public void VerifProdPanier(String ProdPanier) {
		WebDriverWait wait = new WebDriverWait(ConfigMab.driver, Duration.ofSeconds(10));
		@SuppressWarnings("unused")
		String actualText = wait.until(ExpectedConditions.visibilityOf(VerifPanier)).getText();
		String actualtext= VerifPanier.getText();
		Assert.assertEquals(ProdPanier, actualtext);   

	}

}
