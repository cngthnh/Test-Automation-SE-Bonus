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

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Calendar'))

WebUI.click(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/span_February 2022'))

WebUI.click(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/button_New event'))

WebUI.setText(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/input_Event title_name'), 
    'su kien 1')

WebUI.click(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/button_Save_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/button_Month'))

WebUI.click(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/a_Upcoming events_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Calendar Detailed month view January 2022/h3_su kien 1'), 
    'su kien 1')

WebUI.closeBrowser()

