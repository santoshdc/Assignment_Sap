package com.st.test;

import java.io.IOException;

import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;
import org.testng.annotations.DataProvider;

import com.st.pages.SignUpPage;
import com.st.utils.BaseTestObject;

public class SignUpTest extends BaseTestObject {
	
	SignUpPage objSignUpPage;
	
	@Test
public void verifyLogo() throws Exception {
		
		
		
		
		objSignUpPage = new SignUpPage(uiDriver);
		objSignUpPage.verifySiteLogo();
		objSignUpPage.verifyHomePageTitle();
		objSignUpPage.verifySignUp_Button();
			
	}
	
	@Test 
	public void clickOnSignUp() throws Exception {
		objSignUpPage = new SignUpPage(uiDriver);
		objSignUpPage.clickOnSignUpLink();
	}

	@Test
	public void verifying_LabelsandTextBox_OnRegisterPage() {
		objSignUpPage =new SignUpPage(uiDriver);
		objSignUpPage.verifyRegistration_Label_Display();
		objSignUpPage.verifyTellAboutYouselfLabel_isDisplay();
		objSignUpPage.VerifyFirstNameLabel_IsDisplay();
		objSignUpPage.verifyLastNameLabel_IsDisplay();
		objSignUpPage.verifyPasswordLabel_IsDisplay();
		objSignUpPage.verifyReEntryPasswordLabel_IsDisplay();
		objSignUpPage.VerifyCheckBox1_IsDisplay();
		objSignUpPage.verifyCheckBox2_IsDisplay();
		objSignUpPage.verifyRequiredLabel_IsDisplay();
		objSignUpPage.verifyRegisterButton_IsDisplay();
		objSignUpPage.verifyFirstnameTextBox_IsDisplay();
		objSignUpPage.verifyLastNameTextBox_IsDisplay();
		objSignUpPage.verifyPasswordTextBox_IsDisplay();
		objSignUpPage.verifyReEntryPasswordTextBox_IsDisplay();
		
	}
	
	@Test
	public void sending_data_input() throws IOException {
		objSignUpPage.enterData();
	}
	
	@Test
	public void clicking_Registration() {
		objSignUpPage.clickonRegisterBtn();
	}
	
	
		
	
	
}
