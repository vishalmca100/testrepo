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

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Home - Yaathi- Marketplace/a_Login'))

WebUI.setText(findTestObject('Object Repository/marketplace04/Page_Home - Yaathi- Marketplace/input_Login_email'), 'vishal31293@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/marketplace04/Page_Home - Yaathi- Marketplace/input_Login_password'), 
    'yo6k7RrKDb02Y1bxXJ8z0Q==')

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Home - Yaathi- Marketplace/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Home - Yaathi- Marketplace/a_STYLE'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_STYLE - Yaathi- Marketplace/img_Max_img-fluid img-product lazyloaded'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Grey Fancy Fabric Embroidery Saree - Y_7aecef/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/a_Continue to Checkout'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/button_Continue to Payment Method'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/label_Razorpay'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/label_I have read and agree to the         _fc6ab9'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/button_Continue to Payment'))

WebUI.click(findTestObject('Object Repository/marketplace04/Page_Shopping Cart - Yaathi- Marketplace/button_Pay3,650'))

