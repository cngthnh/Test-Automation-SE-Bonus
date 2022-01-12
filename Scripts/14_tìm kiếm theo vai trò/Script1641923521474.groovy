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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Participants'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Select            Keyword           _1df56e'), 
    'roles', true)

WebUI.setText(findTestObject('Object Repository/Page_AI Participants/input_Roles_form_autocomplete_input-1641958602006'), 
    'Teacher')

WebUI.click(findTestObject('Object Repository/Page_AI Participants/li_Teacher'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/button_Apply filters_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Participants/p_3 participants found'), '3 participants found')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Participants/td_t1example.com'), 't1@example.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Participants/td_t2example.com'), 't2@example.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Participants/td_t3example.com'), 't3@example.com')

WebUI.closeBrowser()

