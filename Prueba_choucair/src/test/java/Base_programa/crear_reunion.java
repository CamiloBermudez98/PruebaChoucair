package Base_programa;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crear_reunion extends web_driver{public crear_reunion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}                 
By btnmeet= By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/em");
By btnmetenigs = By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span");
By btnnewmeting = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");

By txt_meting_name = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]");
By txt_meting_numbers = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]");

By cbx_meting_type = By.xpath("//*[@id=\"select2-chosen-6\"]");
By slc_meting_type = By.xpath("//*[@id=\"select2-results-6\"]/li[3]");
By txt_start_meting = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]");
By txt_end_meting = By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]");
By txt_Location_meting = By.xpath("//*[@id=\"select2-chosen-7\"]");
By slc_Location_meting = By.xpath("//*[@id=\"select2-results-7\"]/li[1]");
By txt_Unit_meting = By.xpath("//*[@id=\"select2-chosen-8\"]");

By slc_Unit_meting = By.xpath("//*[@id=\"select2-results-8\"]/li[3]");
By txt_Organized_meting = By.xpath("//*[@id=\"select2-chosen-9\"]");
By slc_Organized_meting = By.xpath("//*[@id=\"select2-results-9\"]/li[7]");
By txt_Reporter_meting = By.xpath("//*[@id=\"select2-chosen-10\"]");
By slc_Reporter_meting = By.xpath("//*[@id=\"select2-results-10\"]/li[2]");
By txt_Attendee_meting = By.xpath("//*[@id=\"select2-chosen-12\"]"); 
By slc_Attendee_meting = By.xpath("//*[@id=\"select2-results-12\"]/li[1]");
By btnsave= By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[1]/div/span");

public void crear_reunion_proceso(String numero) throws InterruptedException {
	 Thread.sleep(1000);	
	click(btnmeet);
	System.out.println("Da click en meet");
	 Thread.sleep(1000);	
	click(btnmetenigs);
	System.out.println("Da click en meeting");
	 Thread.sleep(1000);	
	click(btnnewmeting);
	System.out.println("Da click en new meet");
	Thread.sleep(1000);
	texto(numero,txt_meting_name);
	
	texto("55555",txt_meting_numbers);
	
	click(cbx_meting_type);
	click(slc_meting_type);
	
	limpiar(txt_start_meting);
	texto("04/25/2022",txt_start_meting);
	limpiar(txt_end_meting);
	texto("04/25/2022",txt_end_meting);
	click(txt_Location_meting);
	click(slc_Location_meting);
	click(txt_Unit_meting);
	click(slc_Unit_meting);
	
	click(txt_Reporter_meting);
	click(slc_Reporter_meting);
	
	click(txt_Organized_meting);
	click(slc_Organized_meting);

	click(txt_Attendee_meting);
	click(slc_Attendee_meting);
	try {
	click(btnsave);
	System.out.println("Da click en Guardar");
	System.out.println("La reunion se creo satisfactoriamente");
	}
	catch(Exception e){
		
		System.out.println("No se guardo correctamente");
	}
	
}



}
