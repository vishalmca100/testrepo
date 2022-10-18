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

WebUI.navigateToUrl('https://marketplace.iihtsrt.com/')

WebUI.click(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/a_Login'))

WebUI.setText(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/input_Login_email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/input_Login_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/button_Login'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/a_storeadmin'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Home - Yaathi- Marketplace/a_Admin Panel'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Admin Panel - Yaathi/a_Storage'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Storage - Yaathi/span_Digital Sales'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Digital Sales - Yaathi/a_Earnings'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Digital Sales - Yaathi/span_Homepage Manager'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Homepage Manager - Yaathi/span_Home'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Admin Panel - Yaathi/span_Navigation'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive'))

WebUI.doubleClick(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive'))

WebUI.doubleClick(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive_1'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive'))

WebUI.rightClick(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/img_Navigation Template_img-responsive'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/a_Payouts'))

WebUI.click(findTestObject('Object Repository/payout01/Page_Navigation - Yaathi/a_Add Payout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                              _a26ec3'), 
    '77', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                        PayPal_dfc70b'), 
    'paypal', true)

WebUI.setText(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/input_Withdrawal Amount(INR)_amount'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                        Pendin_022701'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/button_Add Payout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                              _a26ec3'), 
    '77', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                        PayPal_dfc70b'), 
    'swift', true)

WebUI.setText(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/input_Withdrawal Amount(INR)_amount'), 
    '000')

WebUI.selectOptionByValue(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/select_Select                        Pendin_022701'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/payout01/Page_Add Payout - Yaathi/button_Add Payout'))

