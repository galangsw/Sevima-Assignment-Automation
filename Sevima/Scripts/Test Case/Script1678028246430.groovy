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

WebUI.navigateToUrl('https://qa.putraprima.id/')

WebUI.setText(findTestObject('Object Repository/Page_Faktoriall/input_Kalkulator Faktorial_input'), '10')

WebUI.click(findTestObject('Object Repository/Page_Faktoriall/button_Hitung                              _be4487'))

WebUI.click(findTestObject('Object Repository/Page_Faktoriall/a_Terms Of Service'))

WebUI.click(findTestObject('Object Repository/Page_Faktoriall/a_Privacy Policy'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/div_Faktorial dari 10 adalah 3628800'), 'Faktorial dari 10 adalah: 3628800')

WebUI.setText(findTestObject('Object Repository/Page_Faktoriall/input_Kalkulator Faktorial_input'), '172')

WebUI.click(findTestObject('Object Repository/Page_Faktoriall/button_Hitung                              _be4487'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Faktoriall/input_Kalkulator Faktorial_input'))

WebUI.setText(findTestObject('Object Repository/Page_Faktoriall/input_Kalkulator Faktorial_input'), '')

WebUI.click(findTestObject('Object Repository/Page_Faktoriall/button_Hitung                              _be4487'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Faktoriall/div_Please enter an integer'), 'Please enter an integer')

