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

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'xsue+lrReh7u7aVNaHEoWw==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_See all_icon fa fa-comment fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Contacts                                 _f6a0b6'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/h6_Student Tremblay'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/textarea_Use enter to send_yui_3_17_2_1_164_c7019d'), 'Xin chao ban')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Use enter to send_btn btn-link btn-i_5cb4c7'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/p_Xin chao ban'), 'Xin chao ban')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Student Walston'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Log out'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student4')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'xsue+lrReh4ZVHWELaqxDw==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_See all_icon fa fa-comment fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_Xin chao ban_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/h6_Student Walston'), 'Student Walston')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/p_Xin chao ban'), 'Xin chao ban')

WebUI.closeBrowser()

