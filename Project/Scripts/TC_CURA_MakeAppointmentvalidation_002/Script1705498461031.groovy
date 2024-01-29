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

'Validates  "facility" dropdown button and verify if "Hongkong CURA health care center" available in the option or not'
WebUI.verifyOptionPresentByLabel(findTestObject('Cura Pages/CuraPage_Login_OR/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', false, 0)

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.delay(2)

'Verifies whether "medicaid" checkbox option is disabled before you click on the checkbox'
unchecked = WebUI.verifyElementNotChecked(findTestObject('Page_CURA Healthcare Service/input_programs'), 0)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'))

'Loop to check the medicaid radio button'
if (unchecked == 'true') {
    System.out.println('element not checked')

    'Checks the medicaid button'
    WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'))

    System.out.println('element checked')
}

WebUI.delay(3)

'verifies whether the test object is checked of or not'
WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'), 0)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_17'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), 'Katalon')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

