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

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'teacher1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'iKb8CrY6A/iqm08K47hQLA==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/button_End tour'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/div_Information about the Page activity_opt_6f2bd7'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Name_name'), 'Quiz 2')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Upon activity completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Quiz 2/h2_Quiz 2'), 'Quiz 2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Quiz 2/div_No questions have been added yet'), 'No questions have been added yet')

WebUI.closeBrowser()

