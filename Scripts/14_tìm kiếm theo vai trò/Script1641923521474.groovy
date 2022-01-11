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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Select                        Keywor_180ddd'), 
    'roles', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/li_Student'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/li_Teacher'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/div_Match                                  _08f1b5'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/i_Teacher_icon fa fa-times pl-2 mr-0'))

WebUI.deselectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '3', true)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_HCMUS/nav_Side panel                             _87ec86'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), '5MU2PI2jvJCK/lBTYOwt6g==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Participants'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Select                        Keywor_180ddd_1'), 
    'roles', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span__1'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/li_Student'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_No roles                    Manager _431b74'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/button_Apply filters'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AI Participants/td_s9example.com'))

WebUI.closeBrowser()

