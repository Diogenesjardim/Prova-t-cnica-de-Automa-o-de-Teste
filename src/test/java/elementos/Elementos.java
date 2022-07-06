package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	public  By Version = By.xpath("//select[@id='switch-version-select']");
	public  By addUsuario = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
	public  By Name = By.xpath("//input[@name='customerName']");
	public  By LastName = By.cssSelector("#field-contactLastName");	
	public  By ContactFirsName = By.xpath("//input[@id='field-contactFirstName']");
	public  By Phone = By.cssSelector("#field-phone");
    public  By AddressLine1 = By.cssSelector("#field-addressLine1");
    public  By AddressLine2 = By.cssSelector("#field-addressLine2");
    public  By City = By.cssSelector("#field-city");
    public  By State = By.cssSelector("#field-state"); 
    public  By PostalCode = By.cssSelector("#field-postalCode"); 
    public  By Country = By.cssSelector("#field-country");
    public  By from = By.cssSelector("#field_salesRepEmployeeNumber_chosen > a > span");
    public  By but =  By.cssSelector("#field-creditLimit");
    public  By Bondur = By.xpath("//*[@id=\"field-salesRepEmployeeNumber\"]/option[11]");
    public  By CreditLimit = By.xpath("//input[@id='field-creditLimit']");
    public  By Deleted = By.cssSelector("#field-deleted");
    public  By Save = By.id("form-button-save");
    public  By mensagen = By.xpath("/*[@id=\'report-success\']/p/text()[1]");
   
}
