Feature: Login Functionality

Background: user is successfully launch application
Given user open "chrome" browser with exe as "D:\Software Testing\Selenium Real Flipkart Project\Flipkart\src\test\resources\DRIVERS\chromedriver.exe"
Given user open url as "http://www.flipkart.com"
Given user close initial window
Given user mouse hover on Login
Given user click on My Profile

@SmokeTest
Scenario: check Login functionality by using valid credentials
When user enter "7276836672" as Mobile Number
When user enter "7276836672@123" as Password
When user click on Login
Then application shows logged in successfully

Scenario: check login functionality by using vaild username and invalid password
When user enter "7276836672" as Mobile Number
When user enter "7276836675@123" as Password
When user click on Login

Scenario: check login functionality by using invalid username and valid password
When user enter "7376836672" as Mobile Number
When user enter "7276836672@123" as Password
When user click on Login

Scenario: check login functionality by using invalid username and invalid password
hen user enter "7276836632" as Mobile Number
When user enter "7276836672@223" as Password
When user click on Login
