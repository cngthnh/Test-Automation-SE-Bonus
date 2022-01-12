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

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/div_Information about the Page activity_opt_6f2bd7'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Name_name'), 'Quiz 1')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/a_Timing'))

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Enable_timecloseenabled'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing Quiz/select_1900        1901        1902        _6405c9'), 
    '2021', true)

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_AI Quiz 1/button_End tour'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_AI Quiz 1/button_Edit quiz'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/span_a new question'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/span_TrueFalse'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/input_Description_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a TrueFalse question/input_Question name_name'), 'Cau 1')

WebUI.setText(findTestObject('Object Repository/Page_Editing a TrueFalse question/div_Dung hay sai'), '<p dir="ltr" style="text-align: left;">Dung hay sai</p>')

WebUI.setText(findTestObject('Object Repository/Page_Editing a TrueFalse question/input_ID number_idnumber'), '1')

WebUI.click(findTestObject('Object Repository/Page_Editing a TrueFalse question/input__submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/a_Teacher Hubbard'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz 1/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_HCMUS/a_Nhp mn tr tu nhn to'))

WebUI.setText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Username_username'), 'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HCMUS Log in to the site/input_Password_password'), 'xsue+lrReh6nSDZIylEEKg==')

WebUI.click(findTestObject('Object Repository/Page_HCMUS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/button_End tour'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Course Nhp mn tr tu nhn to/span_Quiz 1'))

WebUI.click(findTestObject('Object Repository/Page_AI Quiz 1/button_End tour'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AI Quiz 1/h2_Quiz 1'), 'Quiz 1')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AI Quiz 1/button_Back to the course'))

WebUI.closeBrowser()

