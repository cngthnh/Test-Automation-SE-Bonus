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

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/div_Recommended_optionicon mt-2 mb-1 icon-s_bba414'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Assignment/input_Assignment name_name'), 'Assignment 1')

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Online text_assignsubmission_onlinete_900d47'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_File submissions_assignsubmission_fil_19d1d4'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Enable_assignsubmission_onlinetext_wo_0d4c71'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Assignment/input_Word limit_assignsubmission_onlinetex_3b42b9'), 
    '-10')

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Upon activity completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Assignment 1/h2_Assignment 1'), 'Assignment 1')

WebUI.click(findTestObject('Object Repository/Page_AI Assignment 1/a_Teacher Hubbard'))

WebUI.click(findTestObject('Object Repository/Page_AI Assignment 1/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'xsue+lrReh7u7aVNaHEoWw==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Assignment 1'))

WebUI.click(findTestObject('Object Repository/Page_AI Assignment 1/button_Add submission'))

WebUI.setText(findTestObject('Object Repository/Page_AI Assignment 1 - Edit submission/div_Hello'), 'Hello')

WebUI.click(findTestObject('Object Repository/Page_AI Assignment 1 - Edit submission/input_Online text_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Assignment 1 - Edit submission/span_The word limit for this assignment is _018888'), 
    'The word limit for this assignment is -10 words and you are attempting to submit 1 words. Please review your submission and try again.')

WebUI.closeBrowser()

