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

//Start Application
//Change file location
Mobile.startApplication('C:\\Users\\Heaven\\Downloads\\home-health-workflow-190410-qa-0.1.7.apk', true)

//Login credentials
//Change username (SNV or LVN)
Mobile.setText(findTestObject('loginRepo/usernameEditText'), 'heavenrn', 0)

//Change password (SNV or LVN)
Mobile.setText(findTestObject('loginRepo/passwordEditText'), '12345678Heaven!', 0)

//Login button
Mobile.tap(findTestObject('loginRepo/loginbtn'), 0)

Mobile.delay(10)

//Dashboard page
//Click task on the dashboard
//Change object, the object should be the task that you want to open
//NOTE: every specific task has no permanent object
Mobile.tap(findTestObject('dashboardRepo/android.view.View32'), 0)

Mobile.delay(5)

//Click start visit icon to view the setting of date and time
Mobile.tap(findTestObject('startVisitRepo/startVisit_icon'), 0)

Mobile.delay(5)

//Clicking of start date icon
Mobile.tap(findTestObject('startVisitRepo/date_Icon'), 0)

Mobile.delay(5)

//Change object based on the current object of the calendar
//Instances change frequently so you need to update the object for you to tap the value of the date 
Mobile.tap(findTestObject('startVisitRepo/datePickerRepo/android.view.View103 - 12'), 0)

Mobile.delay(5)

//Clicking of set button for the date picker
Mobile.tap(findTestObject('startVisitRepo/datePickerRepo/set_btn'), 0)

Mobile.delay(5)

//Clicking of time icon to view the time modal 
Mobile.tap(findTestObject('startVisitRepo/time_icon'), 0)

Mobile.delay(5)

//Change hour
Mobile.setText(findTestObject('startVisitRepo/timeRepo/hour_editText'), '03', 0)

//Change minutes
Mobile.setText(findTestObject('startVisitRepo/timeRepo/minute_editText'), '55', 0)

Mobile.delay(5)

//Clicking of set button for the time
Mobile.tap(findTestObject('startVisitRepo/timeRepo/set_btn'), 0)
Mobile.delay(5)

Mobile.closeApplication()

