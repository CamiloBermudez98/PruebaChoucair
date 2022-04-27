package Base_programa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver {
	
	private WebDriver driver;
	
	public web_driver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromedriverconnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/google/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void visit( String url) {
		driver.get(url);
	}	
	public void texto(String texto_entrada,By elemento)
	{
		driver.findElement(elemento).sendKeys(texto_entrada);
	
	}
	
	public void click(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void limpiar(By elemento)
	{
		driver.findElement(elemento).clear();
	}
	public void enter(By elemento)
	{
		driver.findElement(elemento).submit();
	}
	
	public String mensaje_confirmacion(By elemento) {
		return driver.findElement(elemento).getText();	
								
	}
}