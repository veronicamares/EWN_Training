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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_User Management'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_User Management'), 'User Management')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Paul'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_My Leave'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_My Leave'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Time'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnView'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__timeemployeeName'), 'Sara')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Sara Tencrady'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnView'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/form_2020-10-05 to 2020-10-112020-09-28 to _3c929e'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h1_Pay Grades'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Pay Grades_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__payGradename'), 'Sr QA')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Successfully Saved       Close'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Paul'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

