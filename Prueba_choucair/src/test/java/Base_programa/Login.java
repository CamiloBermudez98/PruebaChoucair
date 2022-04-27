package Base_programa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends web_driver {
	
	By username_out = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Username\"]");
	By contraseña_out = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Password\"]");
	By Button = By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]");
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void login_usuario(String usuario,String Contraseña) throws InterruptedException
{
	limpiar(username_out);
	limpiar(contraseña_out);
	 System.out.println("Ingresa a la pagina y hace login con los datos:  "+ usuario+"   "+Contraseña);
	 texto(usuario,username_out);
	  texto(Contraseña,contraseña_out);
	  click(Button);
	  Thread.sleep(1000);		  
	
}

}
