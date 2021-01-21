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
import com.github.javafaker.Faker as Faker

Faker fake = new Faker()

String visitorFullName = fake.name().fullName()

String mobNumber = fake.phoneNumber().phoneNumber()

String placeName = fake.country().capital()

//String VisitorFirstName= fake.name().firstName()
String streetAddress = fake.address().streetAddress()

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Add Visitor'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/Enter_Visitor_Name'), visitorFullName)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/Mobile Number'), mobNumber)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/Place From'), (streetAddress + 
    ', ') + placeName)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/To Meet'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/To meet drop down'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/NEXT Button'), 0)

WebUI.sendKeys(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/Purpose of Visit'), 'Weekend Visit')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Visitors Information/NEXT Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_ First checkbox for Laptop'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab _First Laptop Serial Number'), 'ASDDTY5654hhhnJHGGHjj')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_First Laptop toggle'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_First ADD LAPTOP'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_Second_ADD LAPTOP Serial Number'), 
    'ZXccFFGGggTree55fGGGcFfgg')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_Second laptop serial number Laptop Toggle'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets Tab_Second Serial Number REMOVE LAPTOP'))

WebUI.scrollToElement(findTestObject('STG Env/Admin/Add_ Visitor/Assets/Assets SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Mobile Checkbox'))

WebUI.doubleClick(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Mobile increment'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Mobile Toggle'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Bag checkbox'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Bag increment'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Bag Toggle'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Other Assets Comment box'), 'Pendrive, Headset, Charger')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Assets SAVE Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Add_ Visitor/Assets/Confirmation OK Button'))

