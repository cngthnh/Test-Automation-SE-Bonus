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
    'student11')

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_New password_newpassword'), 
    '5MU2PI2jvJCK/lBTYOwt6g==')

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_First name_firstname'), 
    'Student')

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Surname_lastname'), 
    'Zack')

WebUI.setText(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Email address_email'), 
    's11@example.com')

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Press enter to save changes_preferenc_a80a7a'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Add_aad8ed/input_Address_submitbutton'))

WebUI.navigateToUrl('http://localhost/admin/user.php')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/div_Changes saved'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/a_Admin User'))

WebUI.click(findTestObject('Object Repository/Page_KHTN Administration Users Accounts Bro_45ce40/a_Log out'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student11')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), '5MU2PI2jvJCK/lBTYOwt6g==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Change password/div_You must change your password to proceed'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_Current password_password'), '5MU2PI2jvJCK/lBTYOwt6g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password_newpassword1'), 'xsue+lrReh5yW1Jtmbf0PA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password (again)_newpassword2'), 
    'xsue+lrReh5yW1Jtmbf0PA==')

WebUI.click(findTestObject('Object Repository/Page_Change password/input_New password (again)_submitbutton'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Password has been changed/div_Password has been changed'))

WebUI.click(findTestObject('Object Repository/Page_Password has been changed/button_Continue'))

WebUI.closeBrowser()

