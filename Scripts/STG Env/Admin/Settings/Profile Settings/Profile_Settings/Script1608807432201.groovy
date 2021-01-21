import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Robot robot = new Robot()

Faker fake = new Faker()

String AdminFirstName = fake.name().firstName()

String AdminLastName = fake.name().lastName()

String mobNumber = fake.phoneNumber().phoneNumber()

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Settings Menu'))

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Settings First Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Settings First Name'), AdminFirstName)

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Setting Last Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Setting Last Name'), AdminLastName)

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Setting Mobile Number'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Setting Mobile Number'), mobNumber)

WebUI.scrollToElement(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Settings SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Profile Settings SAVE Button'))

WebUI.click(findTestObject('STG Env/Admin/Settings/Profile_Settings/Confirmation OK Button'))

WebUI.scrollToElement(findTestObject('STG Env/Admin/Settings/Profile_Settings/Settings Menu'), 0)

