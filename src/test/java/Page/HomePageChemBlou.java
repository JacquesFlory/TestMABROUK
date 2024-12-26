package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.ConfigMab;


public class HomePageChemBlou {
	
	@FindBy(xpath= "/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productlist;
	
	@FindBy(xpath= "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/ol/li[3]/span")
	WebElement verifProduct;
	
	
	public HomePageChemBlou() {
		
		PageFactory.initElements(ConfigMab.driver, this);
	
	}
		public void clickOnSpecificProduct(String nomProduit) {
			ConfigMab.attente(10);
			try {
			for(WebElement product:productlist) {
				if(product.getText().contains(nomProduit)) {
					product.click();
				}
				
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void verifProducte(String nomProduit1) {
			ConfigMab.attente(10);
			String actualTitle = verifProduct.getText();
			Assert.assertEquals("Chemises & Blouses", nomProduit1, actualTitle);
			
		}

	}

		


