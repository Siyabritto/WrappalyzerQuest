package WrappalyzerPgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wrappalyzer 
{
ChromeDriver cd_wrp = new ChromeDriver();
	
	@BeforeMethod
	public void meth_before()
	{
		cd_wrp.get("https://www.wappalyzer.com");
	}
	
	@Test
	public void events_keyboard()
	{
		WebElement res = cd_wrp.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span/span"));
		WebElement tech = cd_wrp.findElement(By.xpath("//div[@class='v-list-item__title subtitle-2']"));  
		WebElement shopify = cd_wrp.findElement(By.xpath("//span[@class='accent--text']"));
		WebElement create = cd_wrp.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a"));
		WebElement techno = cd_wrp.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span"));
				
		res.click();
		tech.click();
		shopify.click();
		create.click();
		techno.click();	
	}
	
}
