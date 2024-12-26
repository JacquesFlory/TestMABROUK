package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.ConfigMab;

public class HomePageMab {
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li/a/span")
	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	WebElement verifelement;
	
	public HomePageMab() {
		PageFactory.initElements(ConfigMab.driver, this);
	}
	
	public void mouseOverMenu(String menuName) {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuName)) {
				ConfigMab.actions= new Actions(ConfigMab.driver);
				ConfigMab.actions.moveToElement(menu).perform();
			}
		} 
	}
	
	public void clickOnProduct(String submenutitle) {
		try {
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(submenutitle)) {
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	
	public void verif(String name) {
		ConfigMab.attente(10);
		Assert.assertEquals(name, verifelement.getText());
		
	}

}


