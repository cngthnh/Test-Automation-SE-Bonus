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

WebUI.click(findTestObject('Object Repository/Page_AI Participants/input_Participants_btn btn-secondary my-1'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s9example.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s8example.com'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_Student Clifford'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '24', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_Student Clifford_1'))

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s2example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s2example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s6example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s6example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s10example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s10example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '26', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s4example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s4example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '20', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s7example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s7example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '23', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/span_s3example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '19', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/span_Student Waldrop'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/span_Student Waldrop_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '14', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/small_s5example.com'))

WebUI.doubleClick(findTestObject('Object Repository/Page_AI Participants/small_s5example.com_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AI Participants/select_Student Branch    s9example.com     _e9cf21'), 
    '21', true)

WebUI.click(findTestObject('Object Repository/Page_AI Participants/button_Enrol users'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AI Participants/a_Student Branch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AI Participants/td_s5example.com'))

WebUI.closeBrowser()

