package com.st.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.st.utils.BasePageObject;

import net.sourceforge.htmlunit.corejs.javascript.ast.TryStatement;

public class SignUpPage extends BasePageObject {
	
	//private static Logger Log = Logger.getLogger(Logger.class.getName());

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*Variable Initialization*/	
	By siteLogo =By.className("logo ml2");
	By sign_Up_Btn = By.linkText("Sign up");
	By Registration_header = By.id("ids-heading-1");
	By TellUsAboutYourself_Text= By.className("ids-heading-fieldset");
	By FirstName_leabel=By.id("firstName-label");
	By LastName_Label=By.id("lastName-label");
	By FirstName_TextBox =By.id("firstName");
	By LastName_TextBox =By.id("firstName");
	By Email_Label=By.id("mail-label");
	By Email_TextBox=By.id("mail");
	By SetPassword_Label =By.className("ids-heading-fieldset");
	By PassWord_Label =By.id("newPasswordInput-label");
	By Password_TextBox =By.id("newPasswordInput");
	By ReEntryPassword_Label= By.id("retypeNewPasswordInput-label");
	By ReEntryPassword_TextBox=By.id("retypeNewPasswordInput");
	By TermsandConditions_Label = By.tagName("ids-heading-fieldset");
	By CheckBox_pd=By.id("pdAccept");
	By CheckBox_TandC=By.id("touAccept");
	By Register_Btn= By.id("sapStoreRegisterFormSubmit");
	By Required_Label =By.className("ids-form__required-index");
	
	boolean flag=false;
	String BASE_URL="http://www.naukri.com/";
	String pageTitle=null;
	String Parent_window=null;
	String actual_Result=null;
	String expected_Result=null;
	
	XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	
	
	public boolean verifySiteLogo() throws Exception
	{
	//Log.info("Verification of Sitelogo ");
		try 
		{
			flag=isElementPresent(siteLogo);
			Assert.assertTrue(flag, " Sap Site Logo is Missing");
			return flag;
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED VERIFYING THE SITE LOGO " + "\n verifySiteLogo " +e.getLocalizedMessage());
		}
		
	}
	
	public void verifyHomePageTitle() throws Exception
	{
		//Log.info("getting the Home page title");
		try 
		{
			pageTitle=uiDriver.getTitle().trim();
			Assert.assertEquals(pageTitle, "SAP Conversational AI | Automate Customer Service With AI Chatbots", "Home Page title is not matching or displayed as expected");
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED GETING THE HOMEPAGE TITLE  " + "\n verifyHomePageTitle " +e.getLocalizedMessage());
		}
		
		
		
	}
	
	public boolean verifySignUp_Button() throws Exception {
		
		try {
			
			verifySignUp_Button();
			
			flag=isElementPresent(sign_Up_Btn);
			return flag;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("FAILED WHILE Verifying the Sign_Up LINK FOR NEW USER" +"\n clickOnSignUpLink" +e.getLocalizedMessage());
		}
								
	}
	
	public void clickOnSignUpLink () throws Exception {
		
		try {
			
			uiDriver.findElement(sign_Up_Btn).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("FAILED WHILE CLICKING ON SIGNUP LINK FOR NEW USER" +"\n clickOnSignUpLink" +e.getLocalizedMessage());
		}
		
	}
	
	public boolean verifyRegistration_Label_Display() {
		
		try {
			
			flag=isElementPresent(Registration_header);
			Assert.assertTrue(flag, "Registration- header is missing on registration page");
			return flag;		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;		
		
	}
	
     public boolean verifyTellAboutYouselfLabel_isDisplay() {
		
		try {
			
			flag=isElementPresent(TellUsAboutYourself_Text);
			Assert.assertTrue(flag, "Tell us about yourself- Label is missing on registration page");
			return flag;		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;				
	}
     
     public boolean VerifyFirstNameLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(FirstName_leabel);
 			Assert.assertTrue(flag, "First Name- Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyLastNameLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(LastName_Label);
 			Assert.assertTrue(flag, "Last Name- Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyEmailLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(Email_Label);
 			Assert.assertTrue(flag, "Email - Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean VerifySetPasswordLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(SetPassword_Label);
 			Assert.assertTrue(flag, "Set Password - Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     
     public boolean verifyPasswordLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(PassWord_Label);
 			Assert.assertTrue(flag, "Password - Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyReEntryPasswordLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(ReEntryPassword_Label);
 			Assert.assertTrue(flag, "Re Entry Password - Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean VerifyCheckBox1_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(CheckBox_pd);
 			Assert.assertTrue(flag, "Checkbox 1 - is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     
     public boolean verifyCheckBox2_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(CheckBox_TandC);
 			Assert.assertTrue(flag, "Checkbox 2 - is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyRequiredLabel_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(Required_Label);
 			Assert.assertTrue(flag, "*Required -Label is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyRegisterButton_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(Register_Btn);
 			Assert.assertTrue(flag, "*Register -Button is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyFirstnameTextBox_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(FirstName_TextBox);
 			Assert.assertTrue(flag, "*FirstName -TextBox is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyLastNameTextBox_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(LastName_TextBox);
 			Assert.assertTrue(flag, "*LastName -TextBox is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyPasswordTextBox_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(Password_TextBox);
 			Assert.assertTrue(flag, "*Password -TextBox is missing on registration page");
 			return flag;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public boolean verifyReEntryPasswordTextBox_IsDisplay() {
    	 try {
    		 
    		flag=isElementPresent(ReEntryPassword_TextBox);
 			Assert.assertTrue(flag, "*ReEntryPassword -TextBox is missing on registration page");
 			return flag;
			
 			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
     }
     
     public void enterData() throws IOException {
    	 
    	 uiDriver.switchTo().frame("IDS_UI_Window");
    	 
    	 File src=new File("D:\\Test.xlsx");   
    	 // Load the file.
    	 FileInputStream fis = new FileInputStream(src);
    	 workbook = new XSSFWorkbook(fis);
    	 // Load the sheet in which data is stored.
    	 sheet= workbook.getSheetAt(0);
    	 
    	 for(int i=1; i<=sheet.getLastRowNum(); i++){
    		 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
    		 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
    		 and first column (A) as 0 and second column (B) as 1 and so on*/ 
    		 
    		 // Import data for Email.
    		 cell = sheet.getRow(i).getCell(0);
    		 cell.setCellType(Cell.CELL_TYPE_STRING);
    		 uiDriver.findElement(FirstName_TextBox).clear();
    		 uiDriver.findElement(FirstName_TextBox).sendKeys(cell.getStringCellValue());
    		 
    		 cell = sheet.getRow(i).getCell(1);
    		 cell.setCellType(Cell.CELL_TYPE_STRING);
    		 uiDriver.findElement(LastName_TextBox).clear();
    		 uiDriver.findElement(LastName_TextBox).sendKeys(cell.getStringCellValue());
    		 
    		 cell = sheet.getRow(i).getCell(2);
    		 cell.setCellType(Cell.CELL_TYPE_STRING);
    		 uiDriver.findElement(Password_TextBox).clear();
    		 uiDriver.findElement(Password_TextBox).sendKeys(cell.getStringCellValue());
    		 
    		 cell = sheet.getRow(i).getCell(3);
    		 cell.setCellType(Cell.CELL_TYPE_STRING);
    		 uiDriver.findElement(Password_TextBox).clear();
    		 uiDriver.findElement(Password_TextBox).sendKeys(cell.getStringCellValue());
    		 
    		 
    		 cell = sheet.getRow(i).getCell(4);
    		 cell.setCellType(Cell.CELL_TYPE_STRING);
    		 uiDriver.findElement(ReEntryPassword_TextBox).clear();
    		 uiDriver.findElement(ReEntryPassword_TextBox).sendKeys(cell.getStringCellValue());
    		 
    		 
    			 
         }
        WebElement Check1= uiDriver.findElement(CheckBox_pd);
 		Check1.isDisplayed();
 		Check1.click();
 		 
 	    WebElement check2 =uiDriver.findElement(CheckBox_TandC);
 	    check2.isSelected();
 	    check2.click();
 	    
 	    //click on register button
 	    
 	    
           
     }
     
     public ThanksPagepop clickonRegisterBtn() {
    	 uiDriver.findElement(Register_Btn).isDisplayed();
    	 uiDriver.findElement(Register_Btn).click();
		return ThanksPagepop(uiDriver);
     }

	private ThanksPagepop ThanksPagepop(WebDriver uiDriver) {
		// TODO Auto-generated method stub
		return null;
	}

	
     

}


