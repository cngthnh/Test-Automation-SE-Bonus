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

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'teacher1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'iKb8CrY6A/iqm08K47hQLA==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Forum 1'))

WebUI.click(findTestObject('Object Repository/Page_Forum 1/a_Search forums_action-menu-toggle-3'))

WebUI.click(findTestObject('Object Repository/Page_Forum 1/a_Backup'))

WebUI.click(findTestObject('Object Repository/Page_Backup activity Forum 1/input_Include legacy course files_oneclickbackup'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Backup activity Forum 1/div_The backup file was successfully created'))

WebUI.click(findTestObject('Object Repository/Page_Backup activity Forum 1/button_Continue'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/td_backup-moodle2-activity-6-forum6-2022011_0970fb'))

WebUI.closeBrowser()

