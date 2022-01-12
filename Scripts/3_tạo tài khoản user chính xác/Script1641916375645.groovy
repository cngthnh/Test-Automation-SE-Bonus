import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), '5MU2PI2jvJCK/lBTYOwt6g==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Username_username'), 
    'student1')

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_New password_newpassword'), 
    'xsue+lrReh6nSDZIylEEKg==')

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_First name_firstname'), 
    'Student')

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/div_Username                               _ccea4b'))

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Surname_lastname'), 
    'Waldrop')

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Email address_email'), 
    's1@example.com')

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Address_submitbutton'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/div_Changes saved'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/td_s1example.com'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/a_Admin User'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'xsue+lrReh6nSDZIylEEKg==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Dashboard/span_Student Waldrop'))

WebUI.closeBrowser()

