import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://edlservices.moi.gov.kw/_forms/default.aspx?ReturnUrl=%2f_layouts%2f15%2fAuthenticate.aspx%3fSource%3d%252F&Source=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Civil ID_ctl00PlaceHolderMainsignInControlUserName'), 
    '292072802528')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Password_ctl00PlaceHolderMainsignInControlpassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/input__ctl00PlaceHolderMainsignInControllogin'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/span_'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/a_'))

WebUI.setText(findTestObject('Object Repository/Page_MOIEdl My Profile/input__ctl00ctl43g_4471d6d0_506f_4905_8d6c_1470d82fe96fctl00txtEmail'), 
    'wesam.ahmed2016@outlook.sa')

WebUI.click(findTestObject('Object Repository/Page_MOIEdl My Profile/input_ _ctl00ctl43g_4471d6d0_506f_4905_8d6c_1470d82fe96fctl00LANG'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl My Profile/a_'))

WebUI.click(findTestObject('Object Repository/Page_/span_'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/a_Welcome'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/a_Sign Out'))

WebUI.closeBrowser()

