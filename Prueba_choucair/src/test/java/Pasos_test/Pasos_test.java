package Pasos_test;

import org.openqa.selenium.WebDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base_programa.Login;
import Base_programa.crear_reunion;
import Base_programa.Crear_bussines_unit; 


public class Pasos_test {

	private WebDriver driver;
	
	Login login;
	Crear_bussines_unit  Crear_bussines_unit;
    crear_reunion crear_reunion;
    
	@Given("^El usuario ingresa a la pagina$")
	public void Ingresa_pagina()  {		 
		 login = new Login(driver);
		 driver = login.chromedriverconnection();		
		 driver.manage().window().maximize();
		login.visit("https://serenity.is/demo/");			  
	}
	@When("^Usuario y contrase�a \"([^\"]*)\" \"([^\"]*)\"$")
	public void usuario_y_contrase_a(String string, String string2) throws InterruptedException {
		 
		  login.login_usuario(string, string2);  
	}


	@Then("Crea una busines unit")
	public void crea_una_busines_unit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Crear_bussines_unit = new Crear_bussines_unit(driver);
	   Crear_bussines_unit.crear_bussines();
	}
	
	@Then("Crea una Reunion {string}")
	public void crea_una_reunion(String int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		crear_reunion = new crear_reunion(driver);
		crear_reunion.crear_reunion_proceso(int1);
	   
	}
	


	



	

	



	
}
