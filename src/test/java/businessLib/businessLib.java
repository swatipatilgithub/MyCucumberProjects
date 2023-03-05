package businessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;

public class businessLib extends PageObject{

	public By Name1 = By.xpath("//input[@id='userName']");
	public By Email1 = By.xpath("//input[@id='userEmail']");
	public By CurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By PermanentAddress1 = By.xpath("//textarea[@id='permanentAddress']");
	public By submit = By.id("submit");

	@Managed
	WebDriver driver;

	 public void launchbrowser() {
		open();
	 }
	 public void enterName(String Name){
		 $(Name1).sendKeys(Name); 
	 }	
	 public void Email(String Email){
		 $(Email1).sendKeys(Email); 
	 }	
	 public void Currentaddress(String Currentaddress){
		 $(CurrentAddress).sendKeys(Currentaddress); 
	 }	
	 public void PermanentAddress(String PermanentAddress){
		 $(PermanentAddress1).sendKeys(PermanentAddress); 
	 }
	 public void submit(){
		 $(submit).click(); 
	 }	 
}
