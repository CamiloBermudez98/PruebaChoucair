package Base_programa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Crear_bussines_unit extends web_driver{
	By Organizacion = By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a/em");
	By Busines_unit = By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span");
	By newbussines = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
	By nombre_bussines = By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]");
	By parent_bussines = By.xpath("//*[@id=\"select2-chosen-1\"]");
	By parent_bussines_output = By.xpath("//*[@id=\"s2id_autogen1_search\"]");
	By click_categoria = By.xpath("/html/body/div[7]/ul/li[1]");
	By parent_bussines_save = By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]/div/span");
	
	public Crear_bussines_unit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void crear_bussines() throws InterruptedException {
	click(Organizacion);
	 System.out.println("Da click en Organizacion");
	 Thread.sleep(1000);	
	click(Busines_unit);
	System.out.println("Da click en Bussines Unit");
	click(newbussines);
	 Thread.sleep(1000);	
	System.out.println("Da click en  New Bussines Unit");
	System.out.println("Ingresa el nombre");
	texto("testtt",nombre_bussines);
	click(parent_bussines );
	System.out.println("Ingresa la categoria");
	texto("Acme Corp.",parent_bussines_output);	
	click(click_categoria);
    Thread.sleep(1000);	
	System.out.println("Da clic en guardar");
	click(parent_bussines_save);
}
}
