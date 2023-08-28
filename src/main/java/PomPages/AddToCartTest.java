package PomPages;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	@Test
	public void addToCartTest() throws InterruptedException {
		Map<String, String> map = excel.getData("Sheet1", "Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.mouseHoverElectronic(webUtil);
		home.clickHeadPhonesLink();
		headphone.clickAddToCart();
		Assert.assertEquals(headphone.getAddToCartText(), "ADDED");
		String itemName = headphone.getItemName();
		headphone.ClickOnCartIcon();
		Assert.assertEquals(cart.getCartItem(), itemName);
		
	}

}
